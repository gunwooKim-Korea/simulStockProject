package company.fw;
//SQL�� �����ϴ� Ŭ���� - �����ӿ�ũ ������� ������Ʈ�� �ϴ� ��� XML���·� ����
public class companyQuery {
	
	public static String COMPANY_LIST =
			"select * from Company";

	public static String COMPANY_DETAIL =
			"select * from company where stock_cd = ?";
}