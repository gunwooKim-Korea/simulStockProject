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
import stock.dto.sellDTO;
import stock.dto.stockDTO;
import stock.service.stockService;
import stock.service.stockServiceImpl;


@WebServlet(name = "sell", urlPatterns = { "/sell.do" })
public class sellServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		
		
		req.setCharacterEncoding("euc-kr");

		String val = req.getParameter("val");
		String company_id = req.getParameter("company_id");
		String mem_id = req.getParameter("mem_id");
		
		
		
		
		
		companyInfoDTO info = new companyInfoDTO();
		stockService service = new stockServiceImpl();
		
		int have = service.search(company_id,mem_id);
		
		
		
		
		
		
		
		String msg="";
		
		sellDTO selldto = new sellDTO("판매아이디", "종목코드", "판매날짜", "판매가격", "판매수량");
		haveDTO havedto = new haveDTO("멤버아이디", "종목코드", 1);
		
		if(have>0){
			
			int result = service.sellStock(selldto);
			int result2 = service.update(havedto);
			msg="판매성공";
			
		}else{
			
			msg="주식수량이 부족합니다.";
			
		}
		
		
		
		
		System.out.println(info.toString());
		req.setAttribute("info", info);
		
		
		
		

	
	
		req.setAttribute("menupath", "../myPage/myPage_menu.jsp");
		req.setAttribute("viewpath", "../myPage/myPage_stockHistory.jsp");
		
		RequestDispatcher rd = req
				.getRequestDispatcher("/layout/mainLayout.jsp");
		rd.forward(req, resp);

	}

}