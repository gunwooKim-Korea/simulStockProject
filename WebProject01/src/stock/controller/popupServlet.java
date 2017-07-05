package stock.controller;


import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import stock.dto.buyDTO;
import stock.dto.companyInfoDTO;
import stock.dto.haveDTO;
import stock.dto.stockDTO;
import stock.service.stockService;
import stock.service.stockServiceImpl;


@WebServlet(name = "popup", urlPatterns = { "/popup.do" })
public class popupServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		req.setCharacterEncoding("euc-kr");

		String Stock_name = req.getParameter("Stock_name");
		System.out.println(Stock_name);
		
		
		companyInfoDTO info = new companyInfoDTO();
		stockService service = new stockServiceImpl();
		info = service.companyInfo(Stock_name);
		
		buyDTO buy = new buyDTO("구매아이디", "종목코드", "구매날짜", "구매가격", "구매수량");
		haveDTO have = new haveDTO("구매아이디", "종목코드", 1);
		
		int result = service.buyStock(buy);
		int result2 = service.haveStock(have);
		
		
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