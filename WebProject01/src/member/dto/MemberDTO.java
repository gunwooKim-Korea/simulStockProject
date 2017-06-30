package member.dto;

public class MemberDTO {
	String id;
	String pass;
	String birth;
	String gender;
	String email;
	int point;
	public MemberDTO(String id, String pass, String birth, String gender,
			String email, int point) {
		super();
		this.id = id;
		this.pass = pass;
		this.birth = birth;
		this.gender = gender;
		this.email = email;
		this.point = point;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	
	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", pass=" + pass + ", birth=" + birth
				+ ", gender=" + gender + ", email=" + email + ", point="
				+ point + "]";
	}
	
	
}
