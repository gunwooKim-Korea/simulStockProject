package member.dao;

import static fw.TermQuery.MEMBER_INSERT;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fw.DBUtil;
import member.dto.MemberDTO;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public int insert(MemberDTO mem) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result= 0;
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(MEMBER_INSERT);
			ptmt.setString(1, mem.getMem_id());
			ptmt.setString(2, mem.getPass());
			ptmt.setString(3, mem.getEmail());
			ptmt.setInt(4, mem.getPoint());
			
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}

}
