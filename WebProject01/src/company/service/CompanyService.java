package company.service;

import java.util.ArrayList;

import company.dto.CompanyDTO;


   public interface CompanyService{
	   ArrayList<CompanyDTO> getCompanyList();
	   CompanyDTO getCompanyDetail(String stock_id);
   }

