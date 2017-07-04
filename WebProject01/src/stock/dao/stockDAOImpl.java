package stock.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import stock.dto.buyDTO;
import stock.dto.companyInfoDTO;
import stock.dto.stockDTO;
import fw.DBUtil;
import static fw.MemberQuery.MEMBER_INSERT;
import static stock.fw.stockQuery.*;
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
				stock = new stockDTO(rs.getString(1), 
						rs.getString(2) ,rs.getString(3) ,
						rs.getString(4) ,rs.getString(5) ,
						rs.getString(6) ,rs.getString(7) ,
						rs.getString(8));
				
				list.add(stock);
				
			}
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		
		return list;
	}

	@Override
	public int buyStock(buyDTO buy) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result= 0;
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(buy_INSERT);
			ptmt.setString(1, buy.getMem_id());
			ptmt.setString(2, buy.getCompany_id());
			ptmt.setString(3, buy.getBuy_date());
			ptmt.setString(4, buy.getBuy_price());
			ptmt.setString(5, buy.getBuy_count());
	
			
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}

	@Override
	public companyInfoDTO companyInfo(String Stock_name) {
		
		System.out.println("**************************************");
		companyInfoDTO info=null;
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		
		try {
			con = DBUtil.getConnection();
			
			ptmt = con.prepareStatement(company_info);
		
			ptmt.setString(1, Stock_name);
			rs = ptmt.executeQuery();
			
			while (rs.next()) {
				
			
				info = new companyInfoDTO(rs.getString(1), 
						rs.getString(2), rs.getString(3), rs.getString(4), 
						rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), 
						rs.getString(9), rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13), 
						rs.getString(14), rs.getString(15), rs.getString(16));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ptmt, con);
		}
		
		
		
	return info;
	}

}