package designPatterns.builder;

public class Computer {

	private String cpu;
	private String gpu;
	private int ram;
	private int storage;

	public Computer(String cpu, String gpu, int ram, int storage) {
		super();
		this.cpu = cpu;
		this.gpu = gpu;
		this.ram = ram;
		this.storage = storage;
	}

	public String getCpu() {
		return cpu;
	}

	public String getGpu() {
		return gpu;
	}

	public int getRam() {
		return ram;
	}

	public int getStorage() {
		return storage;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

}
