package designPatterns.factory;

public class ProductA implements Product{

	@Override
	public void create() {
		System.out.println("Product A is created");
		
	}

}
