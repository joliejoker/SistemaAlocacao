package br.fafiretech.training.iu;
import java.util.Scanner;
import br.fafiretech.training.model.Area;
import br.fafiretech.training.model.Course;

public class CourseUI {

	@SuppressWarnings("resource")
	public static void create() {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Informe o nome do curso: ");
		String nome = sc1.nextLine();
		
		System.out.println("Informe a sigla do curso: ");
		String sigla = sc1.nextLine();
		
		System.out.print("Informe o nome do departamento: ");
		String nomeDept = sc1.nextLine();
		
		System.out.print("Informe a sigla do departamento: ");
		String siglaDept = sc1.nextLine();
		
		int areaInt= 0;
		
		do {
			System.out.println("Digite o número da área: \n1 - Humanas \n2 - Exatas \n3 - Biológicas");
			areaInt = sc1.nextInt();
			if(areaInt < 1 || areaInt >3) {
				System.out.println("Informe um dos valores da lista informada.");
			}
		}
		while(areaInt < 1 || areaInt > 3);
		
		Area area = convertAreaIntToArea(areaInt);
		
		Course curso = new Course();
		curso.setNameDepartment(nomeDept);
		curso.setAbbrevDepartment(siglaDept);
		curso.setAreaDepartment(area);
		curso.setNameCourse(nome);
		curso.setAbbrevCourse(sigla);
		
		
		System.out.println(curso.toString());
		
		
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
