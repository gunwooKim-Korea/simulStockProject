package stock.dto;

public class haveDTO {

	String mem_id;
	String company_id;

	int count;

	@Override
	public String toString() {
		return "haveDTO [mem_id=" + mem_id + ", company_id=" + company_id
				+ ", count=" + count + "]";
	}

	public String getMem_id() {
		return mem_id;
	}

	public void setMem_id(String mem_id) {
		this.mem_id = mem_id;
	}

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public haveDTO(String mem_id, String company_id, int count) {
		super();
		this.mem_id = mem_id;
		this.company_id = company_id;
		this.count = count;
	}

}
