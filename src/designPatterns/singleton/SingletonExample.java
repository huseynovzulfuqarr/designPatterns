package designPatterns.singleton;

public class SingletonExample {

	private static SingletonExample instance;

	private SingletonExample() {

	}

	public static SingletonExample getInstance() {
		if (instance == null) {
			instance= new SingletonExample();
		}
		return instance;
	}

	public static void main(String[] args) {
		
		SingletonExample singleton1=SingletonExample.getInstance();
		SingletonExample singleton2= SingletonExample.getInstance();
		System.out.println(singleton1.hashCode());
		System.out.println(singleton2.hashCode());
		System.out.println(singleton1==singleton2);//true

	}

}
