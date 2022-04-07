package sortusinglambdaexpression;

public class Product {

	private int id;
	private String name;
	private String brand;

	public Product(int id, String name, String brand) {
		this.id = id;
		this.name = name;
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int pid) {
		this.id = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Product: [id= " + id + ", name= " + name + ", brand= " + brand + "]";
	}

}
