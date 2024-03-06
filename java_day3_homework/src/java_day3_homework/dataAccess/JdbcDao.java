package demo.dataAccess;

import demo.entities.Category;
import demo.entities.Course;
import demo.entities.Instructor;

public class JdbcDao implements IInstructorDao,ICategoryDao,ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile eklendi: " + course.getName());
		
	}

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile eklendi: " + category.getName());
		
		
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile eklendi: " + instructor.getFirstName() + instructor.getLastName());
		
		
	}

}
