package designPatterns.factory;

public class ProductBFactory implements ProductFactory {

	@Override
	public Product create1() {
		
		return new ProductB();
	}

}
