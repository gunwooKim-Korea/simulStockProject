package stockController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import stock.DAO.stockDAOImpl;
import stockDTO.stockDTO;
import stockService.stockService;
import stockService.stockServiceImpl;



@WebServlet(name = "stock", urlPatterns = { "/stock.do" })
public class stock_view extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		
		
		String state = request.getParameter("state");
		
		
		
		ArrayList<stockDTO> stocklist = new ArrayList<stockDTO>();
		
		
		stockService service = new stockServiceImpl();
		
		if(state.equals("kospi")){
			stocklist = service.getStockList();
		}else if(state.equals("kosdaq")){
			stocklist = service.getStockList();
		}
		
		
		
	
		
		request.setAttribute("menupath", "../stock/stock_menu.jsp");
		request.setAttribute("viewpath", "../stock/stock_view.jsp");
		request.setAttribute("stocklist", stocklist);
		request.setAttribute("state", state);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/layout/mainLayout.jsp");
		rd.forward(request, response);
						
		
		
	}


}
