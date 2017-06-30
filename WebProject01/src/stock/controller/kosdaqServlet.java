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


@WebServlet(name = "kosdaq", urlPatterns = { "/kosdaq.do" })
public class kosdaqServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("euc-kr");

	
		

		HttpSession ses = req.getSession();
	
		req.setAttribute("leftpath", "stock_menu.jsp");
		req.setAttribute("viewpath", "kosdaq_view.jsp");

		RequestDispatcher rd = req
				.getRequestDispatcher("/layout/mainLayout.jsp");
		rd.forward(req, resp);

	}

}
