package stockService;

import java.util.ArrayList;

import stock.dao.stockDAO;
import stock.dao.stockDAOImpl;
import stock.dto.stockDTO;
import term.dao.TermDAO;
import term.dao.TermDAOImpl;
import term.dto.TermDTO;

public class stockServiceImpl implements stockService {

	
	public ArrayList<stockDTO> getStockList() {
	stockDAO dao = new stockDAOImpl();
	ArrayList<stockDTO> list = dao.getStockList();	
	return list;
	}
	
}







