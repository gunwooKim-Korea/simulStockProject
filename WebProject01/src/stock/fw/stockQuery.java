package stock.fw;
//SQL�� �����ϴ� Ŭ���� - �����ӿ�ũ ������� ������Ʈ�� �ϴ� ��� XML���·� ����
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







