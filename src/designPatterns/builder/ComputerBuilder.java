package designPatterns.builder;

public interface ComputerBuilder {
	Computer build();
	ComputerBuilder setCpu(String cpu);
	ComputerBuilder setGpu(String gpu);
	ComputerBuilder setRam(int ram);
	ComputerBuilder setStorage(int storage);
	

}
