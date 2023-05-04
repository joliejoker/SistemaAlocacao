package br.fafiretech.training.business;
import java.util.ArrayList;
import br.fafiretech.training.model.Department;
import br.fafiretech.training.repository.DepartmentRepository;

public class BusinessDepartment {
	
	private DepartmentRepository departmentRepository;

	public BusinessDepartment(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}

	public Department addDepartment(Department department) throws Exception{
		
		if (department == null || department.getNameDepartment().length() < 2) {
			throw new Exception("O nome departamento deve ser preenchido e ter pelo menos 2 caracteres!");
		}
		if(departmentRepository.searchDepartmentByNameAndArea(department.getNameDepartment(), department.getAreaDepartment()) != null) {
			throw new Exception("Não pode existir dois departamentos com mesmo nome e na mesma área.");
		}
		
		return departmentRepository.addDepartment(department);
	}
	
	public ArrayList<Department> listDepartment() {
		
		return departmentRepository.listDeparment();
	}
}
