package nTierArchitecture.dataaccess;

import java.util.ArrayList;
import java.util.List;

import nTierArchitecture.entities.Category;
import nTierArchitecture.entities.Entity;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void Add(Category category) {
		categories.add(category);
	}

	@Override
	public void Delete(Category category) {
		categories.remove(category);
		
	}

	@Override
	public void Update(Category category) {
		System.out.println("jdbc ile güncellendi");
	}

	@Override
	public List<Category> GetAll() {
		return categories;	
	}
}