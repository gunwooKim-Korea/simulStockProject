package stock.dto;

public class buyDTO {
	
	String mem_id ;
	
	String company_id ;
	String buy_date ;
	String buy_price ;
	String buy_count ;
	@Override
	public String toString() {
		return "buyDTO [ mem_id=" + mem_id
				+ ", company_id=" + company_id + ", buy_date=" + buy_date
				+ ", buy_price=" + buy_price + ", buy_count=" + buy_count + "]";
	}
	public buyDTO( String mem_id, String company_id,
			String buy_date, String buy_price, String buy_count) {
		super();
		
		this.mem_id = mem_id;
		this.company_id = company_id;
		this.buy_date = buy_date;
		this.buy_price = buy_price;
		this.buy_count = buy_count;
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
	public String getBuy_date() {
		return buy_date;
	}
	public void setBuy_date(String buy_date) {
		this.buy_date = buy_date;
	}
	public String getBuy_price() {
		return buy_price;
	}
	public void setBuy_price(String buy_price) {
		this.buy_price = buy_price;
	}
	public String getBuy_count() {
		return buy_count;
	}
	public void setBuy_count(String buy_count) {
		this.buy_count = buy_count;
	}

}
