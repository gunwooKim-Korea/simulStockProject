package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.dto.MemberDTO;
import static fw.DBUtil.*;
import static fw.MemberQuery.*;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public MemberDTO login(String id, String pw) {
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = MEMBER_LOGIN;
		ResultSet rs = null;
		MemberDTO member = null;
		
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			
			ptmt.setString(1, id);
			ptmt.setString(2, pw);
			rs = ptmt.executeQuery();

			while(rs.next()){
				System.out.println("ddddttt");
				
				member = new MemberDTO(rs.getString(1),rs.getString(2),
						rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
			}
			System.out.println("µé¿Ô¶¥ !333");
			System.out.println(member.toString());
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBUtil.close(rs, ptmt, con);
		}
		return member;
	}
}
