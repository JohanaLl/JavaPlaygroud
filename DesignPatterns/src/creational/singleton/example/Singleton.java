package creational.singleton.example;

public class Singleton {

	//Instancia única de la clase (Singleton). Volatile lo hace thread save, accesible para un unico recurso
	private static volatile Singleton instance;
	
	public String value;
	
	//constructor privado para que la clase no pueda ser instanciada
	private Singleton(String value) {
		this.value = value;
	}
	
	//synchronized crear un bloqueo para que no se creen multiples instancias en entornos multithread
	public synchronized static Singleton getInstance(String value) {
		if (instance == null) {
			instance = new Singleton(value);
		}
		return instance;
	}
}
