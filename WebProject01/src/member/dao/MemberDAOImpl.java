package member.dao;

import static fw.MemberQuery.MEMBER_INSERT;
import static fw.MemberQuery.MEMBER_LOGIN;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.dto.MemberDTO;
import fw.DBUtil;

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
						rs.getString(3),rs.getInt(4));
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
