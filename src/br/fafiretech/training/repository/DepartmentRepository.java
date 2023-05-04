package br.fafiretech.training.repository;
import br.fafiretech.training.model.Area;
import br.fafiretech.training.model.Department;
import java.util.ArrayList;


public class DepartmentRepository {

	private ArrayList<Department> departmentRepository = new ArrayList<Department>();

	public Department addDepartment(Department department){
		
		departmentRepository.add(department);
		
		return department;
	}
	
	
	public ArrayList<Department> listDeparment(){
		
		return departmentRepository;
	}
	
	public Department searchDepartmentByNameAndArea(String name, Area area){
		
		for (Department department : departmentRepository) {
			
			if(department.getNameDepartment().equals(name) && department.getAreaDepartment().equals(area)) {
				
				return department;
			}
		}
		
		return null;
		
	}
	
	
}
