package stock.dao;

import java.util.ArrayList;

import stock.dto.buyDTO;
import stock.dto.companyInfoDTO;
import stock.dto.haveDTO;
import stock.dto.sellDTO;
import stock.dto.stockDTO;


public interface stockDAO {
	public ArrayList<stockDTO> getStockList();
	int buyStock(buyDTO buy);
	public companyInfoDTO companyInfo(String Stock_name) ;
	public int haveStock(haveDTO have);
	public int search(String company_id, String mem_id);
	public int sellStock(sellDTO selldto);
}










