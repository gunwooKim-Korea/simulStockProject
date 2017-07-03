package term.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "pagination", urlPatterns = { "/pagination.do" })
public class PageServlet extends HttpServlet {

    public PageServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		//��û�� ���� ó��
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		//response�� ������� ����
		//html�� ��û�ϴ� ���� �������ҽ��� ��û�ϴ� �۾����� ��û�� �� ������ ��������
		//�۾��� �����ϰ� �����ؼ� ����� �������µ� �̸� ��ȿ�����̶� �Ǵ��ؼ� 
		//�⺻������ ������ ��û�� �������� ĳ������ �����ϰ� �ִ� �����������ش�.
		//�������� ĳ���� �������� �ʰ� ������ �� ��û �ϵ��� ������� ����
		
		response.setHeader("cache-control", "no-cache,no-store");
		
		PrintWriter pw = response.getWriter();
		String id = request.getParameter("id");
		String msg = "";
		
		if(id.equals("jang")){
			msg = "���Ұ��� ���̵�";
		}else{
			msg = "��밡�� ���̵�";
		}
		
		pw.print(msg);
		
	}

}
