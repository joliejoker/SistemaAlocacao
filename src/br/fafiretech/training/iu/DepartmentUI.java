package br.fafiretech.training.iu;
import br.fafiretech.training.business.BusinessDepartment;
import br.fafiretech.training.model.Area;
import br.fafiretech.training.model.Department;
import br.fafiretech.training.repository.DepartmentRepository;

import java.util.Scanner;



public class DepartmentUI {
	
	public static void create() throws Exception {
		Scanner s1 = new Scanner(System.in);
		
		System.out.print("Informe o nome do departamento: ");
		String nome = s1.nextLine();
		
		System.out.print("Informe a sigla do departamento: ");
		String sigla = s1.nextLine();
		
		int areaInt= 0;
		
		do {
			System.out.println("Digite o número da área: \n1 - Humanas \n2 - Exatas \n3 - Biológicas");
			areaInt = s1.nextInt();
			if(areaInt < 1 || areaInt >3) {
				System.out.println("Informe um dos valores da lista informada.");
			}
		}
		while(areaInt < 1 || areaInt > 3);
		
		
		Area area = convertAreaIntToArea(areaInt);
		
		Department department = new Department(nome, area, sigla);
		
		DepartmentRepository departRepo = new DepartmentRepository();
		
		BusinessDepartment busDepart = new BusinessDepartment(departRepo);
		
		System.out.println(busDepart.addDepartment(department));
		
		//System.out.println(departRepo.addDepartment(department));
		
		//System.out.println(department.toString());
		
		s1.close();
		
	}

	private static Area convertAreaIntToArea(int areaInt) {
		
		Area area = switch (areaInt) {
		case 1: {
			
			yield Area.Humanas;
		}
		case 2: {
			
			yield Area.Exatas;
		}
		case 3: {
			
			yield Area.Biologicas;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + areaInt);
		};
		
		return area;
		
	}
	
}
