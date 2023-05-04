package br.fafiretech.training.model;

public class Professor {
	
	private String name;
	private String cpf;
	private Department department;
	
	public Professor() {}
	
	public Professor(String name, String cpf, Department department) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Professor [name=" + name + ", cpf=" + cpf + ", department=" + department + "]";
	}	
	
}
