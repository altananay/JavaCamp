package nTierArchitecture.business.Concrete;

import nTierArchitecture.business.Abstract.CourseService;
import nTierArchitecture.dataaccess.CourseDao;
import nTierArchitecture.entities.Course;

public class CourseManager implements CourseService {

	private CourseDao courseDao;
	
	public CourseManager(CourseDao courseDao)
	{
		this.courseDao = courseDao;
	}
	
	@Override
	public void Add(Course course) {
		
		courseDao.Add(course);
	}

	@Override
	public void Delete(Course course) {
		courseDao.Delete(course);
		
	}

	@Override
	public void Update(Course course) {
		courseDao.Update(course);
		
	}

	@Override
	public void GetAll() {
		for (Course course : courseDao.courses)
		{
			System.out.println(course.CourseName);
		}
		
	}

}