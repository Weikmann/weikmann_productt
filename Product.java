package product;

public class Product {

	private String name;

	public Product(String name) throws Exception {
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if ((name != null) && (!name.equals("")))
		{
			this.name = name;
		}
		else
		{
			throw new Exception("Fehler in der Methode Product.setName(String name): Kein Name oder leerer Name übergeben!");
		}
	}
	
}
