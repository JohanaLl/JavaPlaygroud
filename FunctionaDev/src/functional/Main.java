package functional;

public class Main {

	public static void main(String[] args) {
		
		ISaludar saludar = user -> System.out.println("Hola Mundo " + user); 
		saludar.Saludar("Codi");
		
		ISaludar saludarDos = name -> {
			
			if (name.equals("Codi"))
				System.out.println("Hola Codi! Tienes el mismo nombre que la mascota de CF");
			else 
				System.out.println("Hola Muindo " + name);
		};
		
		saludarDos.Saludar("Codis");
	}
}
