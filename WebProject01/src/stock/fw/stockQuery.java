package stock.fw;
//SQL만 정의하는 클래스 - 프레임워크 기반으로 프로젝트를 하는 경우 XML형태로 변경
public class stockQuery {
	
	public static String stock_list
	 ="select * from stock";
	public static String buy_INSERT
	="insert into BuyStock values(?,?,?,?,?)";
	
	public static String company_info
	 ="select * from Company where crp_nm = ?";
	
	public static String have_INSERT
	="insert into HaveStock values(?,?,?)";
	
	public static String search
	 ="select COUNT from HaveStock where mem_id =? and company_id = ?";
	
	
}







