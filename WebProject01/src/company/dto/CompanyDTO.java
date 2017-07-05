package company.dto;

public class CompanyDTO {

	String crp_nm;
	String crp_nm_e;
	String crp_nm_i;
	String stock_cd;
	String ceo_nm;
	String crp_cls;
	String crp_no;
	String bsn_no;
	String adr;
	String hm_url;
	String ir_url;
	String phn_no;
	String fax_no;
	String ind_cd;
	String est_dt;
	String acc_mt;
	

public CompanyDTO(){
	
   }


public CompanyDTO(String crp_nm, String crp_nm_e, String crp_nm_i,
		String stock_cd, String ceo_nm, String crp_cls, String crp_no,
		String bsn_no, String adr, String hm_url, String ir_url, String phn_no,
		String fax_no, String ind_cd, String est_dt, String acc_mt) {
	super();
	this.crp_nm = crp_nm;
	this.crp_nm_e = crp_nm_e;
	this.crp_nm_i = crp_nm_i;
	this.stock_cd = stock_cd;
	this.ceo_nm = ceo_nm;
	this.crp_cls = crp_cls;
	this.crp_no = crp_no;
	this.bsn_no = bsn_no;
	this.adr = adr;
	this.hm_url = hm_url;
	this.ir_url = ir_url;
	this.phn_no = phn_no;
	this.fax_no = fax_no;
	this.ind_cd = ind_cd;
	this.est_dt = est_dt;
	this.acc_mt = acc_mt;
}


public String getCrp_nm() {
	return crp_nm;
}


public void setCrp_nm(String crp_nm) {
	this.crp_nm = crp_nm;
}


public String getCrp_nm_e() {
	return crp_nm_e;
}


public void setCrp_nm_e(String crp_nm_e) {
	this.crp_nm_e = crp_nm_e;
}


public String getCrp_nm_i() {
	return crp_nm_i;
}


public void setCrp_nm_i(String crp_nm_i) {
	this.crp_nm_i = crp_nm_i;
}


public String getStock_cd() {
	return stock_cd;
}


public void setStock_cd(String stock_cd) {
	this.stock_cd = stock_cd;
}


public String getCeo_nm() {
	return ceo_nm;
}


public void setCeo_nm(String ceo_nm) {
	this.ceo_nm = ceo_nm;
}


public String getCrp_cls() {
	return crp_cls;
}


public void setCrp_cls(String crp_cls) {
	this.crp_cls = crp_cls;
}


public String getCrp_no() {
	return crp_no;
}


public void setCrp_no(String crp_no) {
	this.crp_no = crp_no;
}


public String getBsn_no() {
	return bsn_no;
}


public void setBsn_no(String bsn_no) {
	this.bsn_no = bsn_no;
}


public String getAdr() {
	return adr;
}


public void setAdr(String adr) {
	this.adr = adr;
}


public String getHm_url() {
	return hm_url;
}


public void setHm_url(String hm_url) {
	this.hm_url = hm_url;
}


public String getIr_url() {
	return ir_url;
}


public void setIr_url(String ir_url) {
	this.ir_url = ir_url;
}


public String getPhn_no() {
	return phn_no;
}


public void setPhn_no(String phn_no) {
	this.phn_no = phn_no;
}


public String getFax_no() {
	return fax_no;
}


public void setFax_no(String fax_no) {
	this.fax_no = fax_no;
}


public String getInd_cd() {
	return ind_cd;
}


public void setInd_cd(String ind_cd) {
	this.ind_cd = ind_cd;
}


public String getEst_dt() {
	return est_dt;
}


public void setEst_dt(String est_dt) {
	this.est_dt = est_dt;
}


public String getAcc_mt() {
	return acc_mt;
}


public void setAcc_mt(String acc_mt) {
	this.acc_mt = acc_mt;
}


@Override
public String toString() {
	return "CompanyDTO [crp_nm=" + crp_nm + ", crp_nm_e=" + crp_nm_e
			+ ", crp_nm_i=" + crp_nm_i + ", stock_cd=" + stock_cd + ", ceo_nm="
			+ ceo_nm + ", crp_cls=" + crp_cls + ", crp_no=" + crp_no
			+ ", bsn_no=" + bsn_no + ", adr=" + adr + ", hm_url=" + hm_url
			+ ", ir_url=" + ir_url + ", phn_no=" + phn_no + ", fax_no="
			+ fax_no + ", ind_cd=" + ind_cd + ", est_dt=" + est_dt
			+ ", acc_mt=" + acc_mt + "]";
}
  
}