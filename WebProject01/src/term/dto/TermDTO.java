package term.dto;

public class TermDTO {
	int rownum;
	String term_id;
	String term_name;
	//String term_mean;
	
	public TermDTO(){
		
	}
	
	public TermDTO(int rownum, String term_id, String term_name) {
		super();
		this.rownum = rownum;
		this.term_id = term_id;
		this.term_name = term_name;
	}



	public int getRownum() {
		return rownum;
	}

	public void setRownum(int rownum) {
		this.rownum = rownum;
	}

	public String getTerm_id() {
		return term_id;
	}

	public void setTerm_id(String term_id) {
		this.term_id = term_id;
	}

	public String getTerm_name() {
		return term_name;
	}

	public void setTerm_name(String term_name) {
		this.term_name = term_name;
	}
	
}
