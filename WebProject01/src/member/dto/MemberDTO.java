package member.dto;

public class MemberDTO {
	String mem_id;
	String pass;
	String email;
	int point;
	
	
	public MemberDTO(){
		
	}


	public MemberDTO(String mem_id, String pass, String email, int point) {
		super();
		this.mem_id = mem_id;
		this.pass = pass;
		this.email = email;
		this.point = point;
	}


	public String getMem_id() {
		return mem_id;
	}


	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPoint() {
		return point;
	}


	public void setPoint(int point) {
		this.point = point;
	}


	
}