package creational.singleton.example;

public class Main {

	public static void main(String[] args) {
		System.out.println("Same value: singleton reused. \n"
				+ "Two values, 2 singletons created (worng). \n"
				+ "Result:");
		
		Thread threadBar = new Thread(new ThreadBar());
		Thread threadFoo = new Thread(new ThreadFoo());
		threadBar.start();
		threadFoo.start();
	}
	
	private static class ThreadFoo implements Runnable {

		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("FOO");
			System.out.println(singleton.value);
		}
		
	}
	
	private static class ThreadBar implements Runnable {

		@Override
		public void run() {
			Singleton singleton = Singleton.getInstance("BAR");
			System.out.println(singleton.value);
		}
		
	}
}
