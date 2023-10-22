package designPatterns.builder;

public class BuilderExample {
	
	public static void main (String [] args) {
		ComputerBuilder builder=new GamingComputerBuilder();
		ComputerDirector director=new ComputerDirector();
		
		Computer computer=director.buildGamingComputer(builder);
		
		System.out.println(computer);
		
		
		
	}

}
