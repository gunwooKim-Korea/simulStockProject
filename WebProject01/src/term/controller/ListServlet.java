package term.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import term.dto.TermDTO;
import term.service.TermService;
import term.service.TermServiceImpl;

@WebServlet(name = "termlist", urlPatterns = { "/termlist.do" })
public class ListServlet extends HttpServlet {
	// 전체 부서 목록 조회, 부서 검색
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String search = req.getParameter("search");
		int page=0;
		// System.out.println("검색어 : "+search);
		
		if(req.getParameter("page")!=null){
			page =Integer.parseInt(req.getParameter("page"));
		}		
		//viewpath=&menupath=
		//String search= null;
		//System.out.println("페이지 : " +page);
		
		// 비지니스메소드 호출
		TermService service = new TermServiceImpl();
		ArrayList<TermDTO> termlist = service.getTermList(search,page);

		int check=0;
		if(termlist.size()<15){
			check=1;
		}
		//System.out.println("termlist 는 : "+termlist.size());
		
		//로그인하지 않고 실행하려고 하면 로그인페이지가 보여질 수 있도록 함

		/*HttpSession ses = req.getSession(false);
		EmpDTO loginUser = null;
		
		if(ses!=null){	
			loginUser = (EmpDTO)ses.getAttribute("user");
		}
		if(loginUser==null){//로그인x
			menupath = "emp_menu.jsp";
			viewpath = "../emp/login.jsp";
		}else{
			menupath = "dept_menu.jsp";
			viewpath = "../dept/dept_list.jsp";
		}
		*/
		
		// 데이터 공유
		req.setAttribute("check", check);
		req.setAttribute("termlist", termlist);
		req.setAttribute("viewpath", "../searchTerm/termList.jsp");
		req.setAttribute("menupath", "../searchTerm/term_menu.jsp");
		
		// 요청재지정
		RequestDispatcher rd = req
				.getRequestDispatcher("/layout/mainLayout.jsp");
		rd.forward(req, resp);

	}

}
