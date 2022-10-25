package nTierArchitecture.dataaccess;

import java.util.ArrayList;
import java.util.List;

import nTierArchitecture.entities.Category;

public interface CategoryDao {
	
	List<Category> categories = new ArrayList<Category>();
	
	public void Add(Category category);

	public void Delete(Category category);

	public void Update(Category category);

	public List<Category> GetAll();
}
