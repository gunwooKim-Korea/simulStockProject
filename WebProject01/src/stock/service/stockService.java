package stock.service;
import java.util.ArrayList;

import stock.dto.stockDTO;
//DAO의 메소드를 호출하는 역할 
public interface stockService {

	ArrayList<stockDTO> getStockList();
}







