package term.service;

import java.util.ArrayList;

import term.dao.TermDAO;
import term.dao.TermDAOImpl;
import term.dto.MeanDTO;
import term.dto.TermDTO;

public class TermServiceImpl implements TermService {
	//dao의 insert를 호출하는 메소드
	
	@Override
	public ArrayList<TermDTO> getTermList(String search,int page){
		TermDAO dao = new TermDAOImpl();
		ArrayList<TermDTO> Pharmlist = dao.getTermList(search,page);
		return Pharmlist;
	}
	
	
	public MeanDTO getTermMean(String termId){
		TermDAO dao = new TermDAOImpl();
		MeanDTO meandto = dao.getTermMean(termId);
		return meandto;
	}
	
}







