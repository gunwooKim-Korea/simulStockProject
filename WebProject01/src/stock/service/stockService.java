package stock.service;
import java.util.ArrayList;

import member.dto.MemberDTO;
import stock.dto.buyDTO;
import stock.dto.stockDTO;
//DAO�� �޼ҵ带 ȣ���ϴ� ���� 
public interface stockService {

	ArrayList<stockDTO> getStockList();
	int buyStock(buyDTO buy);
}







