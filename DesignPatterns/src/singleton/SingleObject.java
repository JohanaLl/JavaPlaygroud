package singleton;

public class SingleObject {

	//instancia
	private static SingleObject instance;
	
	//constructor privado para que la clase no pueda ser instanciada
	private SingleObject() {}
	
	//Obtener la instancia unica disponible
	public static SingleObject getInstance() {
		if (instance == null) {
			instance = new SingleObject();
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!");
	}
}
