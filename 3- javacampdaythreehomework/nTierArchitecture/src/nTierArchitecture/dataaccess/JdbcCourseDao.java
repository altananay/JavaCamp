package nTierArchitecture.dataaccess;

import java.util.List;

import nTierArchitecture.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void Add(Course course) {
		courses.add(course);
		
	}

	@Override
	public void Delete(Course course) {
		courses.remove(course);
		
	}

	@Override
	public void Update(Course course) {
		System.out.println("jdbc ile kurs güncellendi");
		
	}

	@Override
	public List<Course> GetAll() {
		return courses;
	}

}
