package designPatterns.builder;

public class GamingComputerBuilder implements ComputerBuilder {
	    private String cpu;
	    private String gpu;
	    private int ram;
	    private int storage;

	@Override
	public Computer build() {
		
		return new Computer(cpu, gpu, ram, storage);
	}

	@Override
	public ComputerBuilder setCpu(String cpu) {
		this.cpu=cpu;
		return this;
	}

	@Override
	public ComputerBuilder setGpu(String gpu) {
		this.gpu=gpu;
		return this;
	}

	@Override
	public ComputerBuilder setRam(int ram) {
		this.ram=ram;
		return this;
	}

	@Override
	public ComputerBuilder setStorage(int storage) {
		this.storage=storage;
		return this;
	}

}
