package br.fafiretech.training.repository;
import java.util.ArrayList;
import br.fafiretech.training.model.Course;

public class CourseRepository {
	
	private ArrayList<Course> courseRepository = new ArrayList<Course>();
	
	
	public Course addCourse(Course course) {
		
		courseRepository.add(course);
		
		return course;
		
	}

}
