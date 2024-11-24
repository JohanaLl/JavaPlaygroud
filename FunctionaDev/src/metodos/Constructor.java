package metodos;

import java.util.ArrayList;
import java.util.List;

public class Constructor {

	public static void main(String[] args) {
		
		//Referencia a un constructor
		
		//Generar nuevos usuarios e imprimir sus nombres en consola
		List<User> users = new ArrayList<>();
		IUser iUser = User::new;
		
		User user1 = iUser.create("Cody 1", 1);
		User user2 = iUser.create("Cody 2", 2);
		User user3 = iUser.create("Cody 3", 3);
		User user4 = iUser.create("Cody 4", 4);
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		
		users.stream()
			.map(User::getName)
			.forEach(System.out::println);
	}
}
