package apidata;

public class DeptDTO {
	private String name;
	private String mean;

	
	public DeptDTO(){
		
	}

	public DeptDTO(String name, String mean) {
		super();
		this.name = name;
		this.mean = mean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	
	
	
}
