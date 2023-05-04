package br.fafiretech.training.model;

public class Coordinator extends Professor{

	private String coordenateCourses;

	public Coordinator() {}
	
	public Coordinator(String coordenateCourses) {
		super();
		this.coordenateCourses = coordenateCourses;
	}

	public String getCoordenateCourses() {
		return coordenateCourses;
	}

	public void setCoordenateCourses(String coordenateCourses) {
		this.coordenateCourses = coordenateCourses;
	}

	@Override
	public String toString() {
		return "Coordinator [coordenateCourses=" + coordenateCourses + ", getName()=" + getName() + ", getCpf()="
				+ getCpf() + ", getDepartment()=" + getDepartment() + "]";
	}
	
}
