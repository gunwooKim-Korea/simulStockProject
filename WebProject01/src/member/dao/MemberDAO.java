package member.dao;

import member.dto.MemberDTO;

public interface MemberDAO {
	public MemberDTO login(String id, String pw);
}
