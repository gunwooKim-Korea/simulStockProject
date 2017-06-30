package fw;
//SQL만 정의하는 클래스 - 프레임워크 기반으로 프로젝트를 하는 경우 XML형태로 변경
public class TermQuery {
	
	public static String TERM_SEARCH
	 ="select * from term where term_name like '%'||upper(?)||'%' ";
	
	public static String TERM_SELECT
	 ="select * from term  where term_id between ? and ?";
	
	public static String TERM_MEAN
	 ="select term_name,term_mean from term  where term_id = ?";
	
	public static String MEMBER_INSERT
    ="insert into member values(?,?,?,?)";
}







