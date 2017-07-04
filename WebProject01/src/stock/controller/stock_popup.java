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
import stock.service.stockService;
import stock.service.stockServiceImpl;
import member.dto.MemberDTO;


@WebServlet(name = "stock_popup", urlPatterns = { "/stock_popup.do" })
public class stock_popup extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("�߾߾�");
		String val = req.getParameter("val");
		

		//HttpSession sess = req.getSession();
		//MemberDTO user =(MemberDTO) sess.getAttribute("user");
		
	
		
		buyDTO buy = new buyDTO("���ž��̵�", "�����ڵ�", "���ų�¥", "���Ű���", "���ż���");
		stockService service = new stockServiceImpl();
		int result = service.buyStock(buy);
		System.out.println("buy"+buy.toString());
		System.out.println("���ڼ���"+result);
		
		
		String msg = "���ڼ���";
		
		
		req.setAttribute("msg", msg);

		RequestDispatcher rd = req.getRequestDispatcher("/stock/popup.jsp");
		rd.forward(req, resp);

	}

}
