package nTierArchitecture.business.Concrete;

import java.util.List;

import nTierArchitecture.business.Abstract.CategoryService;
import nTierArchitecture.business.Validators.CategoryValidator;
import nTierArchitecture.dataaccess.CategoryDao;
import nTierArchitecture.entities.Category;

public class CategoryManager implements CategoryService{

	private CategoryDao categoryDao;
	
	public CategoryManager(CategoryDao categoryDao)
	{
		this.categoryDao = categoryDao;
	}
	
	@Override
	public void Add(Category category) {
		if (CategoryValidator.isValid(category, categoryDao.categories)) {
			categoryDao.Add(category);
		}
		else {
			System.out.println("validation error");
		}
		
	}

	@Override
	public void Delete(Category category) {
		categoryDao.Delete(category);
		
	}

	@Override
	public void Update(Category category) {
		categoryDao.Update(category);
		
	}

	@Override
	public void GetAll() {
		for (Category category : categoryDao.categories)
		{
			System.out.println(category.name);
		}
	}
}