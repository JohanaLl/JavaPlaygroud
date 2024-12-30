package creational.singleton;

public class SingleObject {

	//Instancia única de la clase (Singleton)
	private static SingleObject instance;
	
	//constructor privado para que la clase no pueda ser instanciada
	private SingleObject() {}
	
	//Obtener la instancia unica disponible
	public static SingleObject getInstance() {
		if (instance == null) {
			//Crear bloqueo para que no se creen multiples instancias en entornos multithread
			synchronized (SingleObject.class) {
				// Segunda comprobación dentro del bloqueo
				if (instance == null) 
					instance = new SingleObject();
			}
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello World!");
	}
}
