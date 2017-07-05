package company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import company.dto.CompanyDTO;
import static company.fw.companyQuery.*;
import fw.DBUtil;

public class CompanyDAOImpl implements CompanyDAO {

	@Override
	public ArrayList<CompanyDTO> getCompanyList() {
		ArrayList<CompanyDTO> list = new ArrayList<CompanyDTO>();
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		CompanyDTO company = null;
	try {	
		con = DBUtil.getConnection();
	    ptmt = con.prepareStatement(COMPANY_LIST);
		rs= ptmt.executeQuery();
		while(rs.next()){
			
				company = new CompanyDTO(rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7),
						rs.getString(8),
						rs.getString(9),
						rs.getString(10),
						rs.getString(11),
						rs.getString(12),
						rs.getString(13),
						rs.getString(14),
						rs.getString(15),
						rs.getString(16));
				list.add(company);	
			
		}
		
		
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		
		return list;
	}

	@Override
	public CompanyDTO getCompanyDetail(String stock_id) {
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		CompanyDTO company = null;

		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(COMPANY_DETAIL);
			ptmt.setString(1, stock_id);
			System.out.println(stock_id + "2");
			rs = ptmt.executeQuery();
			//
			while(rs.next()){
				company = new CompanyDTO(rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getString(6),
						rs.getString(7),
						rs.getString(8),
						rs.getString(9),
						rs.getString(10),
						rs.getString(11),
						rs.getString(12),
						rs.getString(13),
						rs.getString(14),
						rs.getString(15),
						rs.getString(16));
			}
			System.out.println(company.toString());
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			DBUtil.close(rs, ptmt, con);
		}
		
		return company;
	}

}