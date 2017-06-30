package stock.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static stock.fw.stockQuery.*;
import stock.dto.stockDTO;
import stock.fw.*;

public class stockDAOImpl implements stockDAO {

	@Override
	public ArrayList<stockDTO> getStockList() {
		ArrayList<stockDTO> list = new ArrayList<stockDTO>();
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		stockDTO stock = null;
		
		try {
			con = DBUtil.getConnection();
			
			ptmt = con.prepareStatement(stock_list);
			rs = ptmt.executeQuery();
			while (rs.next()) {
				System.out.println("½ºÅ¹ "+stock);
				stock = new stockDTO(rs.getString(1), 
						rs.getString(2) ,rs.getString(3) ,
						rs.getString(4) ,rs.getString(5) ,
						rs.getString(6) ,rs.getString(7) ,
						rs.getString(8));
				System.out.println("½ºÅ¹ "+stock);
				
				list.add(stock);
				
			}
			
			System.out.println("dao" + list.size());
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		
		return list;
	}

}
