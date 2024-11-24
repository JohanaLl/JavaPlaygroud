package metodos;

import java.util.ArrayList;
import java.util.List;

public class InstanciaArbitraria {

	public static void main(String[] args) {
		
		//Referencia a métodos de instancia de forma arbitraria
		
		//Imprimer en consola el nombre de todos los usuarios
		List<User> users = new ArrayList<>();
		
		users.add(new User("Rafael", 29));
		users.add(new User("Eduardo", 25));
		users.add(new User("Manuel", 20));
		users.add(new User("Luis", 15));
		users.add(new User("Marines", 10));
		
		//Forma tradicional
		users.stream()
			.map(user -> user.getName())
			.forEach(System.out::println);
		
		//Metodo por referencia de instancia arbitraria
		users.stream()
			.map(User::getName)
			.forEach(System.out::println);
		
	}
}
