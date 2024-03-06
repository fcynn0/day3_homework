package demo.business;

import demo.core.logging.ILogger;
import demo.dataAccess.ICourseDao;
import demo.entities.Course;

public class CourseManager {
	ICourseDao courseDao;
	ILogger[] iLoggers;
	public CourseManager(ICourseDao courseDao, ILogger[] iLoggers) {
		super();
		this.courseDao = courseDao;
		this.iLoggers = iLoggers;
	}
	
	public void add(Course course) throws Exception{
		if(course.getPrice() < 0) {
			throw new Exception("Kurs fiyati 10'dan dusuk olamaz.");
		}
		
		
		 if(course.getName().equals(course.getName())) {
			 throw new Exception("Kurs isimleri tekrar edemez!");
			 }
		 courseDao.add(course);
		 
		 for (ILogger iLogger : iLoggers) {
			 iLogger.log(course.getName());
			
		}
		
		
	}
	

}
