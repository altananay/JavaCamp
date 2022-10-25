package nTierArchitecture.business.Abstract;

import java.util.List;

import nTierArchitecture.entities.Category;

public interface CategoryService {
	
	public void Add(Category category);
	
	public void Delete(Category category);
	
	public void Update(Category category);
	
	public void GetAll();
}