package stock.service;

import java.util.ArrayList;

import stock.dao.stockDAO;
import stock.dao.stockDAOImpl;
import stock.dto.stockDTO;

public class stockServiceImpl implements stockService {

	
	public ArrayList<stockDTO> getStockList() {
	stockDAO dao = new stockDAOImpl();
	ArrayList<stockDTO> list = dao.getStockList();	
	return list;
	}
	
}









