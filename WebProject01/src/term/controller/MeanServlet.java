package term.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import term.dto.MeanDTO;
import term.service.TermService;
import term.service.TermServiceImpl;

@WebServlet(name = "meanPopup", urlPatterns = { "/meanPopup.do" })
public class MeanServlet extends HttpServlet {
	// 전체 부서 목록 조회, 부서 검색
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		String termId = req.getParameter("termId");
		
		TermService service = new TermServiceImpl();
		MeanDTO mean = service.getTermMean(termId);

		// 데이터 공유
		//req.setAttribute("term_name", mean.getTerm_name());
		//req.setAttribute("term_mean", mean.getTerm_mean());
		req.setAttribute("meandto", mean);
		
		//System.out.println(mean.getTerm_name()+" : "+mean.getTerm_mean());
		
		// 요청재지정
		RequestDispatcher rd = req
				.getRequestDispatcher("/searchTerm/meanPop.jsp");
		rd.forward(req, resp);

	}

}
