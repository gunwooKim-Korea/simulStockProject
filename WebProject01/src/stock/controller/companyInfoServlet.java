package stock.controller;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import stock.dto.companyInfoDTO;
import stock.dto.stockDTO;
import stock.service.stockService;
import stock.service.stockServiceImpl;


@WebServlet(name = "company_info", urlPatterns = { "/company_info.do" })
public class companyInfoServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("euc-kr");

		String Stock_name = req.getParameter("Stock_name");
		System.out.println(Stock_name);
		
		
		companyInfoDTO info = new companyInfoDTO();
		stockService service = new stockServiceImpl();
		info = service.companyInfo(Stock_name);
		
		
		System.out.println(info.toString());
		req.setAttribute("info", info);
		
		
		
		/*

		HttpSession ses = req.getSession();
	
		req.setAttribute("leftpath", "stock_menu.jsp");
		req.setAttribute("viewpath", "kosdaq_view.jsp");*/

		RequestDispatcher rd = req
				.getRequestDispatcher("/stock/popup.jsp");
		rd.forward(req, resp);

	}

}