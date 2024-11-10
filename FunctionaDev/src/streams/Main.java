package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
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
		//.forEach() permite realizar acciones sobre cada elmento de la colección
		numeros.stream()
				.map(num -> num * num)
				.forEach(num -> System.out.println(num));
		
		numeros.stream()
				.forEach(num -> {
					int resultado = num * num;
					System.out.println(resultado);
				});

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
		boolean reprobo = calificaciones.stream()
								.filter(cal -> cal < 6)
								.count() > 0;
		System.out.println(reprobo);
		
		//.anyMatch podemos obtener el mismo resultado de la anterior expresion
		//Permite conocer si un elemento se encuentra dentro de una collección
		boolean result_any = calificaciones.stream()
								.anyMatch(cal -> cal < 6);
		System.out.println(result_any);
		
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
		
		User userdefault = new User("Sin nombre", 30);
		
		//.findAny(), .findFirst() Buscar y obtener elementos en la colección
		User user = users.stream()
			.filter(usu -> usu.getEdad() == 25)
			.findAny()
			.get();
		System.out.println(user.getName());
		
		user = users.stream()
				.filter(usu -> usu.getEdad() == 25)
				.findFirst()
				.get(); //retorna un error en caso que no devuelva nada
		System.out.println(user.getName());
		
		user = users.stream()
				.filter(usu -> usu.getEdad() == 30)
				.findFirst()
				.orElse(userdefault);
		System.out.println(user.getName());
		
		//.count() Verificar cuantos elementos tiene la abstracción
		Long cantidad = numeros.stream()
							.filter(num -> num > 6)
							.count();
		System.out.println(cantidad);
		
		//.sum() sumar los elementos de la colección
		int sum = numeros.stream()
			.mapToInt(n -> n).sum();
		System.out.println(sum);
		
		//.average() obtener el promedio de una coleccipon
		double promedio = numeros.stream()
				.mapToInt(n -> n)
				.average()
				.orElse(0);
		System.out.println(promedio);
		
		//.min() obtener el minimo de la collección
		int minimo = numeros.stream()
						.mapToInt(n -> n)
						.min()
						.getAsInt();
		System.out.println(minimo);
		
		//.max() obtener el maximo de la collección
		int maximo = numeros.stream()
						.mapToInt(n -> n)
						.max()
						.getAsInt();
		System.out.println(maximo);
		
		//.reduce() reducir los elementos de una colección
		//Permite retornar un solo resultado a partir de los elementos de una collección
		int reduce = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
			.reduce( 0, ( acumulador, elemento ) -> acumulador + elemento);
		System.out.println("Suma all " + reduce);
		//.reduce(valorInicialAcumulador, Expreseón lambda ())
		
		String string = Stream.of("Java", "C", "Python", "Ruby")
			.reduce( "", (acumulador, lenguaje) -> acumulador.isEmpty() ? lenguaje : acumulador + " | " + lenguaje);
		System.out.println(string);
		
		//.distinct() Elementos unicos de una colección
		List<String> names_w = List.of("Codi 1", "Codi 2", "Codi 1", "Codi 3", "Codi 4");
		names_w.stream().distinct().forEach( elemento -> System.out.println(elemento));
		
		//Ordernar los numeros de una lista
		List<Integer> numbers_s = List.of(1, 4, 6, 2, 8, 3, 10, 7, 9, 5);
		List<Integer> result_s = numbers_s.stream()
									.sorted()
									.toList();
		System.out.println(result_s); //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		result_s = numbers_s.stream()
				.sorted( Comparator.reverseOrder() )
				.toList();
		System.out.println(result_s); //[10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
		
		//Ordenar elementos de una colección a apartir de atributos de un objeto
		
		//Ordenar por copias
//		List<Book> books = List.of(); //las listas creadas con List.of() son inmutables en Java
		List<Book> books = new ArrayList<>(); //ArrayList<>() mutable
		
		books.add(new Book("El señor de los anillos", 150));
		books.add(new Book("Don Quijote de la Mancha", 500));
		books.add(new Book("Historia de dos ciudades", 200));
		books.add(new Book("El hobbit", 100));
		books.add(new Book("El principito", 140));
		
		books.stream()
			.sorted( Comparator.comparing(book -> book.getCopies()) )
			.forEach(book -> System.out.println(book.getTitle()));
		
		System.out.println("************************************");
		
		Comparator<Book> compCopies = Comparator.comparing(book -> book.getCopies());
		books.stream()
		.sorted( compCopies.reversed() )
		.forEach(book -> System.out.println(book.getTitle()));
		
		//Mostrar en consola los 3 ultimos más vendidos
		System.out.println("****************MAS VENDIDOS********************");
		books.stream()
		.sorted( compCopies.reversed() )
		.limit(3) //.limit() Limitar los elementos mostrados
		.forEach(book -> System.out.println(book.getTitle()));
		
		System.out.println("****************TITULOS********************");
		//Ordenar por el título del libro
		Comparator<Book> compTitle;
		//Dependiendo el estado se obtiene un comportamiento y valor diferente
		if (books.stream().count() > 3) 
			compTitle = Comparator.comparing(book -> book.getCopies());
		else
			compTitle = Comparator.comparing(book -> book.getTitle());
		
		books.stream()
			.sorted( compTitle.reversed() )
			.limit(3)
			.forEach( book -> System.out.println(book.getTitle()) );
	}
}
