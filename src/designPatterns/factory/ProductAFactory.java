package designPatterns.factory;

public class ProductAFactory implements ProductFactory {

	@Override
	public Product create1() {
		
		return new ProductA();
	}

}
