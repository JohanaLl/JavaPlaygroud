package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {	
		//Obtener la conatidad de usuarios con una edad mayor a 18
		int count = 0;
		
		List<User> users = List.of(
				new User("Rafael", 25),
				new User("Daniel", 20),
				new User("Tania", 15),
				new User("Luisa", 24),
				new User("Raul", 21)				
		);
		
		// Imperativo (paradigma)
		for (User user : users) {
			if (user.getEdad() > 18) {
				count ++;
			}
		}
		System.out.println("Mayores 18 imperaitvo: " + count);
		
		// Declarativo (paradigma)
		count = (int) users.stream()
							.filter( user -> user.getEdad() > 18 )
							.count();
		System.out.println("Mayores 18 declarativo: " + count);
		
		count = (int) users.stream()
				.filter( user -> user.getEdad() > 18 )
				.filter(user -> user.getName().startsWith("R"))
				.count();
		System.out.println("Mayores 18 y user stars R declarativo: " + count);
		
		Stream<User> stream = users.stream();
		System.out.println(stream.filter(user -> user.getEdad() > 18).toList());
		
		//Generar nuevos Streams a partir de colleciones
		//Colección
		List<User> users_w = new ArrayList<>();
		Stream<User> stream_w = users_w.stream(); //Abstraccion
		
		//Stream
		Stream<User> filter = stream_w.filter(user -> user.getEdad() > 8);
		
		//Arreglo
		int[] numbers = {1, 2, 3, 4};
		Stream numbersS = Stream.of(numbers);
		
		//Secuencia
		Stream names = Stream.of("Codi 1", "Codi 2", "Codi3");
		
		List<User> newUsers = users.stream()
									.filter(user -> user.getEdad() > 18)
									.collect(Collectors.toList());
		System.out.println(newUsers);
		
	}
}
