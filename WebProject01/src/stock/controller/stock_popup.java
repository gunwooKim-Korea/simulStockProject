package stockController;

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


@WebServlet(name = "stock_popup", urlPatterns = { "/stock_popup.do" })
public class stock_popup extends HttpServlet {
	// ��ü�μ������ȸ , �μ��˻�
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String id = req.getParameter("id");
		

		
		String msg = "���ڼ���";
		
		
		req.setAttribute("msg", msg);

		RequestDispatcher rd = req.getRequestDispatcher("/stock/popup.jsp");
		rd.forward(req, resp);

	}

}
