package company.dao;

import java.util.ArrayList;

import company.dto.CompanyDTO;

public interface CompanyDAO {
	ArrayList<CompanyDTO> getCompanyList();
	CompanyDTO getCompanyDetail(String stock_id);
}
