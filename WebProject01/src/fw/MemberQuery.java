package fw;

public class MemberQuery {
	public static String MEMBER_LOGIN = 
			"select * from Member where mem_id = ? and pass = ?";
}
