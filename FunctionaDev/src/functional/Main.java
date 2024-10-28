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
		
		ISuma suma = (val1, val2) -> val1 + val2;
		int result = suma.suma(10, 20);
		System.out.println(result);
		
		suma = (val1, val2) -> {
			
			int sum = val1 + val2;
			System.out.println("El rsultado de la expreseión es " + sum);
			return sum;
		};
		
		result = suma.suma(100, 200);
		System.out.println(result);
	}
}
