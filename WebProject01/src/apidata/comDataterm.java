package apidata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import static apidata.DBUtil.*;


public class comDataterm {
	
	static int count=1275;
	
	public static String DEPT_INSERT
	="insert into term values(?,?,?)";

	public static void insert(Element eElement){
		Connection con = null;
		PreparedStatement ptmt = null;
		
		int result= 0;
		
		try {
			con = getConnection();
			ptmt = con.prepareStatement(DEPT_INSERT);
			ptmt.setInt(1, count++);
			ptmt.setString(2, getTagValue("fnceDictNm", eElement));
			ptmt.setString(3, getTagValue("ksdFnceDictDescContent", eElement));
			System.out.println(count);
			result = ptmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			close(null, ptmt, con);
		}
		//return result;
	}
	
	// tag값의 정보를 가져오는 메소드
	private static String getTagValue(String tag, Element eElement) {
		NodeList nlList = eElement.getElementsByTagName(tag).item(0)
				.getChildNodes();
		Node nValue = (Node) nlList.item(0);
		if (nValue == null)
			return null;
		return nValue.getNodeValue();
	}

	public static void main(String[] args) {
		int page = 1; // 페이지 초기값
		try {
			while (true) {
				// parsing할 url 지정(API 키 포함해서)
				String url = "http://api.seibro.or.kr/openapi/service/FnTermSvc/getFinancialTermMeaning?numOfRows=75&pageNo=1&ServiceKey=vGMMq31EEWF2VtfrEwW7itpKLSX%2FilcJvB%2BgCC0twiX0aEsTdheU5FaV3qPmOJ3iMyouE18a201bF2FROON0xQ%3D%3D";

				DocumentBuilderFactory dbFactoty = DocumentBuilderFactory
						.newInstance();
				DocumentBuilder dBuilder = dbFactoty.newDocumentBuilder();
				Document doc = dBuilder.parse(url);

				// root tag
				doc.getDocumentElement().normalize();
				System.out.println("Root element :"
						+ doc.getDocumentElement().getNodeName());

				// 파싱할 tag
				NodeList nList = doc.getElementsByTagName("item");
				 System.out.println("파싱할 리스트 수 : "+ nList.getLength());

				for (int temp = 0; temp < nList.getLength(); temp++) {
					Node nNode = nList.item(temp);
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {

						Element eElement = (Element) nNode;
						Thread.sleep(70);
						insert(eElement);
				/*		System.out.println("######################");
						// System.out.println(eElement.getTextContent());
						System.out.println("금융사  : "
								+ getTagValue("fnceDictNm", eElement));
						System.out.println("상품 코드  : "
								+ getTagValue("ksdFnceDictDescContent", eElement));*/
					
					} // for end
				} // if end

				page += 1;
				System.out.println("page number : " + page);
				if (page == 2) {
					break;
				}
			} // while end

		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch end
	} // main end
} // class end

