package term.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import term.dto.TermDTO;
import term.service.TermService;
import term.service.TermServiceImpl;

@WebServlet(name = "termlist", urlPatterns = { "/termlist.do" })
public class ListServlet extends HttpServlet {
	// ��ü �μ� ��� ��ȸ, �μ� �˻�
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		int page=1;
		String ck = req.getParameter("ck");	//previous, next, null
		int startpage = 1;
		
		////////////////////////////////////////////////////////////
		
				if(req.getParameter("page")!=null){
					page =Integer.parseInt(req.getParameter("page"));
				//	System.out.println("page : "+page);
					startpage=page;
					if(ck!=null){
						if(ck.equals("previous")&page!=1){
							page=page-5;
							startpage = page;
						//	System.out.println("previous����������: "+startpage);
						}else if(ck.equals("next")){
							page=page+5;
							startpage=page;
							//System.out.println("next����������: "+startpage);
						}
					}else{
						if((page%5)==0){startpage=page-4;}
						else if((page%5)!=1){startpage=page-(page%5)+1;}
					}
			}	

		////////////////////////////////////////////////////////////
				
		String search = req.getParameter("search");
	//	System.out.println("��"+search+"��");
		TermService service = new TermServiceImpl();
		ArrayList<TermDTO> termlist = service.getTermList(search,page);

		int check=0;
		if(termlist.size()<15){
			check=1;
		}
		
		// ������ ����
		req.setAttribute("check", check);
		req.setAttribute("termlist", termlist);
		req.setAttribute("startpage", startpage);
		req.setAttribute("viewpath", "../searchTerm/termList.jsp");
		
		// ��û������
		RequestDispatcher rd = req
				.getRequestDispatcher("/layout/mainLayout02.jsp");
		rd.forward(req, resp);

	}

}
