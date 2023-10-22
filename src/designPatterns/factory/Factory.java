package designPatterns.factory;

public class Factory {
	public static void main(String [] args) {
		
		ProductFactory factoryA=new ProductAFactory();
		ProductFactory factoryB=new ProductBFactory();
		
		Product product1=factoryA.create1();
		Product product2=factoryB.create1();
		
		product1.create();//Product A is created
		product2.create();//Product B is created
		
	
		
		
	}

}
