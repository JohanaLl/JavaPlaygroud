package dependencyInversion;

/**
 * Dependecy Inversion (Inversión de dependencias)
 * 
 * Establece que los modulos de alto nivel, es decir los mas cercanos a las ideas humanas
 * de lo que debe hacer el software, no deben depender de los debajo nivel (los mas 
 * cercanos a las implementación). Ambos deberían depender de las abstracciones del
 * problema (interfaces).
 * Además los detalles de implementación deben depender de las abstracciones
 */
public class Main {

	public static void main(String[] args) {
		DataAccess access = new DataAccess(new DatabaseService());
		access.getData();
	}
}
