package nTierArchitecture.dataaccess;

import java.util.List;

import nTierArchitecture.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

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
		System.out.println("Hibernate ile güncellendi");
		
	}

	@Override
	public List<Category> GetAll() {
		System.out.println("Hibernate ile getirildi.");
		return categories;
	}
	
}