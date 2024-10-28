package functional;

public class Main {

	public static void main(String[] args) {
		
		ISaludar saludar = user -> System.out.println("Hola Mundo " + user); 
		saludar.Saludar("Codi");
	}
}
