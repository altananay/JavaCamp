package nTierArchitecture.dataaccess;

import java.util.List;

import nTierArchitecture.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void Add(Course course) {
		courses.add(course);
		
	}

	@Override
	public void Delete(Course course) {
		courses.add(course);
		
	}

	@Override
	public void Update(Course course) {
		System.out.println("hibernate ile course güncellendi");
		
	}

	@Override
	public List<Course> GetAll() {
		return courses;
	}

}
