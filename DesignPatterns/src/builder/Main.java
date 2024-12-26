package builder;

/**
 * Patron cracional que permite la cración de diferentes representaciones de un objeto
 * Se utiliza en situaciones en las que el objeto tiene una gran cantidad de atributos en el constructor
 * por lo que la construccion se realiza en un conunto de pasos.
 * Tambien se suele utilizar este patron para constuir objetos inmutables
 */
public class Main {

	public static void main(String[] args) {
		//Construir un usuario con Builder
		User user = new UserBuilder()
				.name("Leidy")
				.lastName("Llanos")
				.address("Calle falsa 123")
				.email("leidy@gmail.com")
				.build();
		
		User user2 = new UserBuilder()
				.name("Johana")
				.build(); 
		
		//Usar el objeto crado
		System.out.println("User: " + user);
		System.out.println("Nombre: " + user.getName());
		System.out.println("Email: " + user.getEmail());
		
		System.out.println();
		
		System.out.println("Nombre2: " + user2.getName());
		System.out.println("Email2: " + user2.getEmail());
	}
}
