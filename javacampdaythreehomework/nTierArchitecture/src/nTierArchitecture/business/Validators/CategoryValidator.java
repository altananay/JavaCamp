package nTierArchitecture.business.Validators;

import java.util.List;

import nTierArchitecture.entities.Category;

public class CategoryValidator {
	
	public static boolean isValid(Category category, List<Category> categories)
	{
		if (!category.name.isEmpty() && !categories.contains(category)) {
			return true;
		}
		else {
			return false;
		}
	}

}
