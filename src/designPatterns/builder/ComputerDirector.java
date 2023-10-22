package designPatterns.builder;

public class ComputerDirector {
	
	public Computer buildGamingComputer(ComputerBuilder computerBuilder) {
		return computerBuilder.setCpu("Intel i9")
				.setGpu("NVIDIA RTX 3080")
				.setRam(32)
				.setStorage(1000)
				.build();
	}

}
