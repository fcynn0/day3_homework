package demo.dataAccess;

import demo.entities.Category;
import demo.entities.Course;
import demo.entities.Instructor;

public class HibernateDao implements IInstructorDao,ICategoryDao,ICourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile eklendi: " + course.getName());
		
	}

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile  eklendi: " + category.getName());
		
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile eklendi: " +instructor.getFirstName() + instructor.getLastName() );
		
		
	}

}
