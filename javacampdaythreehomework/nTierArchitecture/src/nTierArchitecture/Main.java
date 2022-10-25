package nTierArchitecture;

import nTierArchitecture.business.Concrete.CategoryManager;
import nTierArchitecture.business.Concrete.CourseManager;
import nTierArchitecture.core.CrossCuttingConcerns.Logging.DatabaseLogger;
import nTierArchitecture.core.CrossCuttingConcerns.Logging.FileLogger;
import nTierArchitecture.core.CrossCuttingConcerns.Logging.LoggerBase;
import nTierArchitecture.core.CrossCuttingConcerns.Logging.MailLogger;
import nTierArchitecture.dataaccess.CategoryDao;
import nTierArchitecture.dataaccess.HibernateCategoryDao;
import nTierArchitecture.dataaccess.JdbcCategoryDao;
import nTierArchitecture.dataaccess.JdbcCourseDao;
import nTierArchitecture.entities.Category;
import nTierArchitecture.entities.Course;
import nTierArchitecture.entities.Instructor;

public class Main {

	public static void main(String[] args) {
		Category category = new Category();
		category.name = "programlama";
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao());
		categoryManager.Add(category);
		categoryManager.GetAll();

		//categoryManager.Delete(category);
		categoryManager.Add(category);
		categoryManager.GetAll();
		LoggerBase[] loggerBases = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		for (LoggerBase loggerBase : loggerBases)
		{
			loggerBase.Logging(category);
		}
		Instructor instructor = new Instructor();
		instructor.FirstName = "altan";
		instructor.LastName = "anay";
		Course course = new Course();
		course.category = category;
		course.CourseName = "java ile programlama";
		course.instructor = instructor;
		course.price = 100;
		CourseManager courseManager = new CourseManager(new JdbcCourseDao());
		courseManager.Add(course);
		courseManager.GetAll();
		categoryManager.Add(category);
		for (LoggerBase loggerBase : loggerBases)
		{
			loggerBase.Logging(course);
		}
	}

}
