package designPatterns.factory;

public class ProductB implements Product {

	@Override
	public void create() {
		System.out.println("Product B is created");
		
	}

}
