package stock.controller;

import java.io.IOException;
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
import javax.websocket.Session;

import stock.dto.buyDTO;
import stock.dto.sellDTO;
import member.dto.MemberDTO;


@WebServlet(name = "stock_popup", urlPatterns = { "/stock_popup.do" })
public class stock_popup extends HttpServlet {
	// 전체부서목록조회 , 부서검색
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("야야야");
		String val = req.getParameter("val");
		
		
		
		HttpSession sess = req.getSession();
		MemberDTO user =(MemberDTO) sess.getAttribute("user");
		System.out.println("세션 아이디 가능?"+val+","+user.toString());
		buyDTO buy = new buyDTO("구매아이디", "종목코드", "구매날짜", "구매가격", "구매수량");
		
		
		
		String msg = "투자성공";
		
		
		req.setAttribute("msg", msg);

		RequestDispatcher rd = req.getRequestDispatcher("/stock/popup.jsp");
		rd.forward(req, resp);

	}

}
