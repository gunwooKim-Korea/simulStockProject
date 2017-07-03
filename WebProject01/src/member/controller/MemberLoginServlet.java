package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.dto.MemberDTO;
import member.service.MemberService;
import member.service.MemberServiceImpl;

@WebServlet(name = "login", urlPatterns = { "/login.do" })
public class MemberLoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pass");
		String chk = request.getParameter("member_id_save");
		System.out.println(id + " asdf " + pw );
		HttpSession sess = request.getSession();
		sess.setAttribute("id", id);

		MemberService service = new MemberServiceImpl();
		MemberDTO user = service.login(id, pw);
		sess.setAttribute("user", user);
		System.out.println(user.toString());
		
		if(user == null){
			response.sendRedirect("Home.jsp"); 
		} else {
			request.setAttribute("loginpage", "member/member_mypage.jsp");			
		}

		RequestDispatcher rd =
				request.getRequestDispatcher("HomeAfterLogin.jsp");
		rd.forward(request, response);

	}

}