package company.service;

import java.util.ArrayList;

import company.dao.CompanyDAO;
import company.dao.CompanyDAOImpl;
import company.dto.CompanyDTO;

public class CompanyServiceImpl implements CompanyService {

	@Override
	public ArrayList<CompanyDTO> getCompanyList() {
		CompanyDAO dao = new CompanyDAOImpl();
		ArrayList<CompanyDTO> list = dao.getCompanyList();
		return list;
	}

	@Override
	public CompanyDTO getCompanyDetail(String stock_id) {
		CompanyDAO dao = new CompanyDAOImpl();
		CompanyDTO dto = dao.getCompanyDetail(stock_id);
		return dto;
	}

  
}
