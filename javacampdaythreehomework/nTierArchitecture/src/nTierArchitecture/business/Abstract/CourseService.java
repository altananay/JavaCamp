package nTierArchitecture.business.Abstract;

import nTierArchitecture.entities.Course;

public interface CourseService {
	
public void Add(Course course);
	
	public void Delete(Course course);
	
	public void Update(Course course);
	
	public void GetAll();

}
