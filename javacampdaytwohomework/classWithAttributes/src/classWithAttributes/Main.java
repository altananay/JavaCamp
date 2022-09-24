package classWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "laptop", "msi", 2500, 3, "siyah");
		/*product.setName("laptop");
		product.setId(1);
		product.setDescription("msi");
		product.setPrice(2500);
		product.setStockAmount(3);*/
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
