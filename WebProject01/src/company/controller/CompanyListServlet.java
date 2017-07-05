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

@WebServlet(name = "companylist", urlPatterns = { "/companylist.do" })
public class CompanyListServlet extends HttpServlet {

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String state = request.getParameter("state");
        
		ArrayList<CompanyDTO> companylist = new ArrayList<CompanyDTO>();
		CompanyService service = new CompanyServiceImpl();
		
		if(state.equals("company")){
			companylist = service.getCompanyList();
		}
			
		companylist = service.getCompanyList();
		
		request.setAttribute("menupath", "../company/company_menu.jsp");
		request.setAttribute("viewpath", "../company/company_main.jsp");
		request.setAttribute("companylist", companylist);
		request.setAttribute("state", state);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/layout/mainLayout.jsp");
		rd.forward(request, response);
						
		
		
	}


}