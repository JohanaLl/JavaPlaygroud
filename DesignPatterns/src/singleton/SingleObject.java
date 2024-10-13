package singleton;

public class SingleObject {

	//instancia
	private static SingleObject instance;
	private static int count = 0;
	
	//constructor privado para que la clase no pueda ser instanciada
	private SingleObject() {
		count++;
	}
	
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
	
    protected void finalize() throws Throwable {
        count--;
        super.finalize();
    }
    
    public static int getCount() {
        return count;
    }
}
