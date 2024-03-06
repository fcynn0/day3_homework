package demo;

import demo.business.CategoryManager;
import demo.business.CourseManager;
import demo.business.InstructorManager;
import demo.core.logging.DatabaseLogger;
import demo.core.logging.FileLogger;
import demo.core.logging.ILogger;
import demo.core.logging.MailLogger;
import demo.dataAccess.HibernateDao;
import demo.dataAccess.JdbcDao;
import demo.entities.Category;
import demo.entities.Course;
import demo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ILogger[] iLoggers= {new DatabaseLogger(),new FileLogger(),new MailLogger()}; 
		
		Instructor instructor=new Instructor(1, "Engin", " Demiroğ");
		InstructorManager instructorManager=new InstructorManager(new HibernateDao(), iLoggers);
		instructorManager.add(instructor);
		
		Category category=new Category(1, "software");
		CategoryManager categoryManager=new CategoryManager(new HibernateDao(), iLoggers);
		categoryManager.add(category);
		
		Course course=new Course(1, "java camp",40);
		CourseManager courseManager=new CourseManager(new HibernateDao(), iLoggers);
		courseManager.add(course);
		

	}

}
