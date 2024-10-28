package functional;

public class Main {

	public static void main(String[] args) {
		
		ISaludar saludar = () -> { System.out.println("Hola Mundo!"); };
		saludar.Saludar();
	}
}
