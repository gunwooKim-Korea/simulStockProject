package stock.dto;

public class sellDTO {

	String mem_id ;
	
	String company_id ;
	String sell_date ;
	String sell_price ;
	String sell_count ;
	@Override
	public String toString() {
		return "sellDTO [ mem_id=" + mem_id
				+ ", company_id=" + company_id + ", sell_date=" + sell_date
				+ ", sell_price=" + sell_price + ", sell_count=" + sell_count
				+ "]";
	}
	public sellDTO( String mem_id, String company_id,
			String sell_date, String sell_price, String sell_count) {
		super();
		
		this.mem_id = mem_id;
		this.company_id = company_id;
		this.sell_date = sell_date;
		this.sell_price = sell_price;
		this.sell_count = sell_count;
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
	public String getSell_date() {
		return sell_date;
	}
	public void setSell_date(String sell_date) {
		this.sell_date = sell_date;
	}
	public String getSell_price() {
		return sell_price;
	}
	public void setSell_price(String sell_price) {
		this.sell_price = sell_price;
	}
	public String getSell_count() {
		return sell_count;
	}
	public void setSell_count(String sell_count) {
		this.sell_count = sell_count;
	}

}
