package getterandsetter;

public class Product {
	
	private int id;
	private String Name;
	private String Description;
	private double Price;
	private int StockAmount;
	private String Renk;
	private String Kod;
	
	public Product()
	{
		System.out.println("product constructor");
	}
	
	public Product(int id, String name, String description, double price, int stockAmount, String renk)
	{
		this.id = id;
		this.Name = name;
		this.Description = description;
		this.Price = price;
		this.StockAmount = stockAmount;
		this.Renk = renk;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getStockAmount() {
		return StockAmount;
	}
	public void setStockAmount(int stockAmount) {
		StockAmount = stockAmount;
	}
	public String getRenk() {
		return Renk;
	}
	public void setRenk(String renk) {
		Renk = renk;
	}
	public String getKod() {
		return Kod;
	}
	public void setKod(String kod) {
		Kod = kod;
	}
	
	
}
