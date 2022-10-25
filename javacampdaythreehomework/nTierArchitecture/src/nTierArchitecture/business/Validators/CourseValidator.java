package nTierArchitecture.business.Validators;

import java.util.List;

import nTierArchitecture.entities.Course;

public class CourseValidator {
	
	public static boolean isValid(Course course, List<Course> courses)
	{
		if (course.price > 0 && !courses.contains(course.category) && !courses.contains(course)) {
			return true;
		}
		else {
			return false;
		}
	}

}
