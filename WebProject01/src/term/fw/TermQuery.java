package term.fw;
//SQL�� �����ϴ� Ŭ���� - �����ӿ�ũ ������� ������Ʈ�� �ϴ� ��� XML���·� ����
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







