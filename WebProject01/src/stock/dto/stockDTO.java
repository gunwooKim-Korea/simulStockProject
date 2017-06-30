package stock.dto;

public class stockDTO {
	String stock_name;
	String cur_price;
	
	String yesterday;
	String change_rate;
	String trade_val;
	String buy_fav_price;
	String sell_fav_price;
	String sum_price;
	@Override
	
	
	
	public String toString() {
		return "StockDTO [stock_name=" + stock_name + ", cur_price="
				+ cur_price + ", yesterday=" + yesterday + ", change_rate="
				+ change_rate + ", trade_val=" + trade_val + ", buy_fav_price="
				+ buy_fav_price + ", sell_fav_price=" + sell_fav_price
				+ ", sum_price=" + sum_price + "]";
	}
	public stockDTO(String stock_name, String cur_price, String yesterday,
			String change_rate, String trade_val, String buy_fav_price,
			String sell_fav_price, String sum_price) {
		super();
		this.stock_name = stock_name;
		this.cur_price = cur_price;
		this.yesterday = yesterday;
		this.change_rate = change_rate;
		this.trade_val = trade_val;
		this.buy_fav_price = buy_fav_price;
		this.sell_fav_price = sell_fav_price;
		this.sum_price = sum_price;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public String getCur_price() {
		return cur_price;
	}
	public void setCur_price(String cur_price) {
		this.cur_price = cur_price;
	}
	public String getYesterday() {
		return yesterday;
	}
	public void setYesterday(String yesterday) {
		this.yesterday = yesterday;
	}
	public String getChange_rate() {
		return change_rate;
	}
	public void setChange_rate(String change_rate) {
		this.change_rate = change_rate;
	}
	public String getTrade_val() {
		return trade_val;
	}
	public void setTrade_val(String trade_val) {
		this.trade_val = trade_val;
	}
	public String getBuy_fav_price() {
		return buy_fav_price;
	}
	public void setBuy_fav_price(String buy_fav_price) {
		this.buy_fav_price = buy_fav_price;
	}
	public String getSell_fav_price() {
		return sell_fav_price;
	}
	public void setSell_fav_price(String sell_fav_price) {
		this.sell_fav_price = sell_fav_price;
	}
	public String getSum_price() {
		return sum_price;
	}
	public void setSum_price(String sum_price) {
		this.sum_price = sum_price;
	}
	
	
	
}
