package company.fw;
//SQL만 정의하는 클래스 - 프레임워크 기반으로 프로젝트를 하는 경우 XML형태로 변경
public class companyQuery {
	
	public static String COMPANY_LIST =
			"select * from Company";

	public static String COMPANY_DETAIL =
			"select * from company where stock_cd = ?";
}