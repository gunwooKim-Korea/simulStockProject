package stock.service;

import java.util.ArrayList;

import stock.dao.stockDAO;
import stock.dao.stockDAOImpl;
import stock.dto.buyDTO;
import stock.dto.companyInfoDTO;
import stock.dto.haveDTO;
import stock.dto.sellDTO;
import stock.dto.stockDTO;

public class stockServiceImpl implements stockService {

	
	public ArrayList<stockDTO> getStockList() {
	stockDAO dao = new stockDAOImpl();
	ArrayList<stockDTO> list = dao.getStockList();	
	return list;
	}


	public int buyStock(buyDTO buy) {
	stockDAO dao = new stockDAOImpl();
	int result = 	dao.buyStock(buy);
		
	return result;
	}


	@Override
	public companyInfoDTO companyInfo(String Stock_name) {
	stockDAO dao = new stockDAOImpl();
	companyInfoDTO info = dao.companyInfo(Stock_name);
	return info;
	}


	@Override
	public int haveStock(haveDTO have) {
	int result =0;
	stockDAO dao = new stockDAOImpl();
	result = dao.haveStock(have);
	return result;
	}


	@Override
	public int search(String company_id, String mem_id) {
		int result = 0;
		stockDAO dao = new stockDAOImpl();
		result = dao.search(company_id ,mem_id);
		return result;
	}


	@Override
	public int sellStock(sellDTO selldto) {
		int result = 0;
		stockDAO dao = new stockDAOImpl();
		result = dao.sellStock(selldto);
		return result;
	}



}









