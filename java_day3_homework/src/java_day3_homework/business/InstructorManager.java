package demo.business;

import demo.core.logging.ILogger;
import demo.dataAccess.IInstructorDao;
import demo.entities.Instructor;

public class InstructorManager {
	private IInstructorDao instructorDao;
	private ILogger[] loggers;
	public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	public void add(Instructor instructor) {
		
		instructorDao.add(instructor);
		
		for (ILogger Logger : loggers) {
			Logger.log(instructor.getFirstName() + instructor.getLastName());
		}
	}
	
	

}
