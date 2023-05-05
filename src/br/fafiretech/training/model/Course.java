package br.fafiretech.training.model;

public class Course extends Department{

	private String nameCourse;
	private String abbrevCourse;

	public Course() {}
	
	public Course(String nameCourse, String abbrevCourse) {
		super();
		this.nameCourse = nameCourse;
		this.abbrevCourse = abbrevCourse;
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public String getAbbrevCourse() {
		return abbrevCourse;
	}

	public void setAbbrevCourse(String abbrevCourse) {
		this.abbrevCourse = abbrevCourse;
	}

	@Override
	public String toString() {
		return "Course: [Nome do Curso = " + nameCourse + ", \nSigla do Curso = " + abbrevCourse + ", \nNome do Departamento = "
				+ getNameDepartment() + ", \nÁrea do Departamento = " + getAreaDepartment() + ", \nSigla do Departamento = "
				+ getAbbrevDepartment() + "]";
	}
	
}
