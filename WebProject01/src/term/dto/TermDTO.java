package term.dto;

public class TermDTO {
	int term_id;
	String term_name;
	//String term_mean;
	
	public TermDTO(){
		
	}
	
	public TermDTO(int term_id, String term_name) {
		super();
		this.term_id = term_id;
		this.term_name = term_name;
		//this.term_mean = term_mean;
	}

	public int getTerm_id() {
		return term_id;
	}

	public void setTerm_id(int term_id) {
		this.term_id = term_id;
	}

	public String getTerm_name() {
		return term_name;
	}

	public void setTerm_name(String term_name) {
		this.term_name = term_name;
	}

	
}
