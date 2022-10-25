package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("product validator static constructor");
	}
	
	public ProductValidator()
	{
		System.out.println("product validator constructor");
	}
	
	public static boolean isValid(Product product)
	{
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}