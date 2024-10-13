package singleton;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		
		System.out.println("Initial count: " + SingleObject.getCount());
		
		//Unico Objeto disponible
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
		
		System.out.println("After creating two objects: " + SingleObject.getCount());
		
		SingleObject object2 = SingleObject.getInstance();
		object2.showMessage();
		
		System.out.println("After creating two objects: " + SingleObject.getCount());
		
		SingleObject object3 = SingleObject.getInstance();
		object3.showMessage();

		System.out.println("After creating two objects: " + SingleObject.getCount());
		
		SingleObject object4 = SingleObject.getInstance();
		object4.showMessage();

		System.out.println("After creating two objects: " + SingleObject.getCount());

	}
}
