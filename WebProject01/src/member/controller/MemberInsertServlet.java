package member.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.dto.MemberDTO;
import member.service.MemberService;
import member.service.MemberServiceImpl;



@WebServlet(name = "member", urlPatterns = { "/member.do" })
public class MemberInsertServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("euc-kr");

		resp.setContentType("text/html;charset=euc-kr");
		PrintWriter pw = resp.getWriter();
		
		System.out.println(req.getParameter("point"));
		
		
		String mem_id = req.getParameter("mem_id");
		String pass = req.getParameter("pass");
		String email = req.getParameter("email");
		int point = Integer.parseInt(req.getParameter("point"));
	
		MemberDTO mem = new MemberDTO(mem_id, pass, email, point);
		System.out.println(mem);
		//2. 비지니스 메소드 호출
		MemberService service = new MemberServiceImpl();
		int result = service.insert(mem);
		System.out.println(result);
		
		/*req.setAttribute("menupath", "company_menu.jsp");
		req.setAttribute("viewpath", "company_main.jsp");*/

		RequestDispatcher rd = req
				.getRequestDispatcher("Home.jsp");
		rd.forward(req, resp);

	}

}

