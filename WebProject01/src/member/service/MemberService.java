package member.service;

import member.dto.MemberDTO;

public interface MemberService {
	public MemberDTO login(String id, String pw);
	
	int insert(MemberDTO mem);

}
