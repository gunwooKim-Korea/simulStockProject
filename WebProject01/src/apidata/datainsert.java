package apidata;


import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.io.BufferedReader;
import java.io.IOException;

public class datainsert {
    public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://api.seibro.or.kr/openapi/service/FnTermSvc/getFinancialTermMeaning"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=vGMMq31EEWF2VtfrEwW7itpKLSX%2FilcJvB%2BgCC0twiX0aEsTdheU5FaV3qPmOJ3iMyouE18a201bF2FROON0xQ%3D%3D"); /*Service Key*/
       // urlBuilder.append("&" + URLEncoder.encode("파라미터영문명","UTF-8") + "=" + URLEncoder.encode("파라미터기본값", "UTF-8")); /*파라미터설명*/
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
    }
}