package stock.service;

import java.util.ArrayList;

import stock.dao.stockDAO;
import stock.dao.stockDAOImpl;
import stock.dto.buyDTO;
import stock.dto.companyInfoDTO;
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
	
}









