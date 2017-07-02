package term.dto;

public class MeanDTO {
	String term_name;
	String term_mean;
	
	public MeanDTO(){
		
	}

	public MeanDTO( String term_name,
			String term_mean) {
		super();
		this.term_name = term_name;
		this.term_mean = term_mean;
	}


	public String getTerm_name() {
		return term_name;
	}

	public void setTerm_name(String term_name) {
		this.term_name = term_name;
	}

	public String getTerm_mean() {
		return term_mean;
	}

	public void setTerm_mean(String term_mean) {
		this.term_mean = term_mean;
	}
	
	
}
