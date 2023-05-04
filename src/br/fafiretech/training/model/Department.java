package br.fafiretech.training.model;

public class Department {
	
	private String nameDepartment;
	private Area areaDepartment;
	private String abbrevDepartment;
	
	public Department() {}
	
	public Department(String nameDepartment, Area areaDepartment, String abbrevDepartment) {
		super();
		this.nameDepartment = nameDepartment;
		this.areaDepartment = areaDepartment;
		this.abbrevDepartment = abbrevDepartment;
	}


	public String getNameDepartment() {
		return nameDepartment;
	}


	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}


	public Area getAreaDepartment() {
		return areaDepartment;
	}


	public void setAreaDepartment(Area areaDepartment) {
		this.areaDepartment = areaDepartment;
	}


	public String getAbbrevDepartment() {
		return abbrevDepartment;
	}

	public void setAbbrevDepartment(String abbrevDepartment) {
		this.abbrevDepartment = abbrevDepartment;
	}

	@Override
	public String toString() {
		return "Department [nameDepartment=" + nameDepartment + ", areaDepartment=" + areaDepartment
				+ ", abbrevDepartment=" + abbrevDepartment + "]";
	}
	
}
