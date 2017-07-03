package term.fw;
//SQL만 정의하는 클래스 - 프레임워크 기반으로 프로젝트를 하는 경우 XML형태로 변경
public class TermQuery {
	
	public static String TERM_SEARCH
	 ="select count,term_id,term_name from (select rownum count,term_id,term_name from term where term_name like '%'||upper(?)||'%') where count between ? and ? ";
	
	public static String TERM_SELECT
	 ="select count,term_id,term_name from (select rownum count,term_id,term_name from term) where count between ? and ?";
	
	public static String TERM_MEAN
	 ="select term_name,term_mean from term  where term_id = ?";
	
	public static String TERM_MEAN2
	 ="select rownum,term_id,term_name,term_mean from term  where term_id = ? and rownum between ? and ?";
	
}







