package nTierArchitecture.dataaccess;

import java.util.ArrayList;
import java.util.List;

import nTierArchitecture.entities.Course;

public interface CourseDao {

	List<Course> courses = new ArrayList<Course>();
	
	public void Add(Course course);

	public void Delete(Course course);

	public void Update(Course course);

	public List<Course> GetAll();
	
}
