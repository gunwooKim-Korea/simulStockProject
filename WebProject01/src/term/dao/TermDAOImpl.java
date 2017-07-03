package term.dao;

import static fw.DBUtil.close;
import static fw.DBUtil.getConnection;
import static term.fw.TermQuery.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import term.dto.MeanDTO;
import term.dto.TermDTO;

public class TermDAOImpl implements TermDAO {
	
	@Override
	public ArrayList<TermDTO> getTermList(String search,int page){
		ArrayList<TermDTO> termlist = new ArrayList<TermDTO>();
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		TermDTO term = null;//하나의 레코드를 담을 객체 - 레코드를 조회하면서 하나씩 만들어서
		                    //                 넣어야 한다.
		try {
			con = getConnection();
			int a = ((page-1)*15)+1;
			int b = (page*15);
			if(search==null || search==""){	//목록조회
				ptmt = con.prepareStatement(TERM_SELECT);
				ptmt.setInt(1, a);
				ptmt.setInt(2, b);
			}else{//search작업
				ptmt = con.prepareStatement(TERM_SEARCH);
				ptmt.setString(1, "%"+search+"%");
				ptmt.setInt(2, a);
				ptmt.setInt(3, b);
			}
			rs = ptmt.executeQuery();
			
			while(rs.next()){
				term = new TermDTO(rs.getInt(1),rs.getString(2),rs.getString(3));
				termlist.add(term);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(rs, ptmt, con);
		}
		return termlist;
	}
	
	
	public MeanDTO getTermMean(String termId){
		MeanDTO termdto = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		                    //                 넣어야 한다.
		try {
			con = getConnection();
		
				ptmt = con.prepareStatement(TERM_MEAN);
				ptmt.setString(1, termId);
			
			rs = ptmt.executeQuery();
			
			if(rs.next()){
				termdto = new MeanDTO(rs.getString(1),rs.getString(2));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			close(rs, ptmt, con);
		}
		return termdto;
	}
}








