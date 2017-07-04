package stock.dao;

import java.util.ArrayList;

import stock.dto.buyDTO;
import stock.dto.companyInfoDTO;
import stock.dto.stockDTO;


public interface stockDAO {
	public ArrayList<stockDTO> getStockList();
	int buyStock(buyDTO buy);
	public companyInfoDTO companyInfo(String Stock_name) ;
}










