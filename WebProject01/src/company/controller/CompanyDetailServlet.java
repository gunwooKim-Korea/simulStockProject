package company.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import company.dto.CompanyDTO;
import company.service.CompanyService;
import company.service.CompanyServiceImpl;


@WebServlet(name = "companydetail", urlPatterns = { "/companydetail.do" })
public class CompanyDetailServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String stock_id = request.getParameter("stock_id");
			
		System.out.println(stock_id + "1");
		CompanyDTO company = new CompanyDTO();
		CompanyService service = new CompanyServiceImpl();

		company = service.getCompanyDetail(stock_id);
		
		System.out.println(company.getStock_cd());	
		
		request.setAttribute("menupath", "../company/company_menu.jsp");
		request.setAttribute("viewpath", "../company/company_info1.jsp");
		request.setAttribute("company", company);
		//request.setAttribute("stock_id", stock_id);
		
		RequestDispatcher rd = request.getRequestDispatcher("/layout/mainLayout.jsp");
		rd.forward(request, response);
	}
}