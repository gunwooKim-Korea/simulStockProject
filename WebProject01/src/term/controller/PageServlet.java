package term.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "pagination", urlPatterns = { "/pagination.do" })
public class PageServlet extends HttpServlet {

    public PageServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//요청에 대한 처리
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//response의 헤더값을 변경
		//html을 요청하는 것이 정적리소스를 요청하는 작업으로 요청이 될 때마다 서버에서
		//작업을 수행하고 실행해서 결과를 가져오는데 이를 비효율적이라 판단해서 
		//기본설정이 동일한 요청이 들어왔을때 캐쉬에서 저장하고 있는 파일을보여준다.
		//응답결과를 캐쉬에 저장하지 않고 서버에 재 요청 하도록 헤더값에 설정
		
		response.setHeader("cache-control", "no-cache,no-store");
		
		PrintWriter pw = response.getWriter();
		String id = request.getParameter("id");
		String msg = "";
		
		if(id.equals("jang")){
			msg = "사용불가능 아이디";
		}else{
			msg = "사용가능 아이디";
		}
		
		pw.print(msg);
		
	}

}
