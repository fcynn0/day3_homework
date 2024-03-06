package demo.business;

import demo.core.logging.ILogger;
import demo.dataAccess.ICategoryDao;
import demo.entities.Category;

public class CategoryManager {
	ICategoryDao iCategoryDao;
	ILogger[] iLoggers;
	public CategoryManager(ICategoryDao iCategoryDao, ILogger[] iLoggers) {
		super();
		this.iCategoryDao = iCategoryDao;
		this.iLoggers = iLoggers;
	}
	public void add(Category category) throws Exception {
		if(category.getName().equals(category.getName())) {
			throw new Exception("Kategori ismi tekrar edemez!");
		}
		
		iCategoryDao.add(category);
		
		for (ILogger iLogger : iLoggers) {
			iLogger.log(category.getName());
		
		}
		
	}
	

}
