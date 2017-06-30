package member.service;

import member.dao.MemberDAO;
import member.dao.MemberDAOImpl;
import member.dto.MemberDTO;

public class MemberServiceImpl implements MemberService {

	@Override
	public int insert(MemberDTO mem) {
		MemberDAOImpl dao = new MemberDAOImpl();
		int result = dao.insert(mem);
		return result;
	}

	@Override
	public MemberDTO login(String id, String pw) {
		MemberDAO dao = new MemberDAOImpl();
		MemberDTO dto = dao.login(id, pw);
		return dto;
	}

}
