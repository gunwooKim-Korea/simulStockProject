package stock.service;
import java.util.ArrayList;

import stock.dto.buyDTO;
import stock.dto.companyInfoDTO;
import stock.dto.haveDTO;
import stock.dto.sellDTO;
import stock.dto.stockDTO;
//DAO의 메소드를 호출하는 역할 
public interface stockService {

	ArrayList<stockDTO> getStockList();
	int buyStock(buyDTO buy);
	companyInfoDTO companyInfo(String Stock_name);
	int haveStock(haveDTO have);
	int search(String company_id, String mem_id);
	int sellStock(sellDTO selldto);
}







