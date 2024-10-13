package singleton;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		
		//Unico Objeto disponible
		SingleObject object = SingleObject.getInstance();
		object.showMessage();

	}
}
