package member.fw;

public class MemberQuery {
	public static String MEMBER_LOGIN = 
			"select * from member where mem_id = ? and pass = ?";
	
	public static String MEMBER_INSERT
		="insert into member values(?,?,?,?)";
}