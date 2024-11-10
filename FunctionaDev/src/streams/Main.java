package streams;

import java.util.ArrayList;
import java.util.Arrays;
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
		
		//Obtener el cuadrado de todos los numeros de la lista
		//.map() - modificar el valor de los elementos de una colección
		List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> result = numeros.stream()
									.map(num -> num * num)
									.toList();
		System.out.println(numeros);
		System.out.println(result);
		
		//Generar una lista de números enteros apartir de la lista ya existente.
		List<String> strings = List.of("1", "2", "3", "4");
		
		List<Integer> numbersI = strings.stream()
								.map(num -> Integer.parseInt(num))
								.toList();
		System.out.println(numbersI);
		
		//Imprimir en consola los strings con todas sus letras en mayúsculas.
		List<String> strings_w = List.of("a", "b", "codi");
		strings_w = strings_w.stream()
					.map(letter -> letter.toUpperCase())
					.collect( Collectors.toList() );
		System.out.println(strings_w);
		
		//Generar una lista de valores booleanos los cuales hagan referencia a las 
		//calificaciones de los alumnos. La calificación minima aprovatoria es 6.
		List<Integer> calificaciones = List.of(9, 8, 9, 5, 10, 7);
		List<Boolean> booleans = calificaciones.stream()
									.map(cal -> cal > 5)
									.toList();
		System.out.println(booleans);
		
		/*
		 * En ocasiones tendremos la necesidad de transformar objetos regulares a streams 
		 * primitivos o viceversa. En esos casos podemos hacer uso de métodos tales cómo :
		 * mapToInt
		 * mapToLong
		 * mapToDouble
		 */
		
		//.flatMap() se usa para combinar multiples colecciones
		List<String> names1 = Arrays.asList("Codi 1", "Codi 2");
		List<String> names2 = Arrays.asList("Codi 3", "Codi 4");
		List<String> names3 = Arrays.asList("Codi 5", "Codi 6");
		
		List<String> results = Stream.of(names1, names2, names3) //[[Codi 1, Codi 2], [Codi 3, Codi 4], [Codi 5, Codi 6]]
			  .flatMap(element -> element.stream()) //[Codi 1, Codi 2, Codi 3, Codi 4, Codi 5, Codi 6]
			  .toList();
		System.out.println(results);
	}
}
