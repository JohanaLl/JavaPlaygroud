package metodos;

import java.util.Arrays;
import java.util.List;

public class Estaticos {

	public static void main(String[] args) {
		
		//Referencia a métodos estáticos
		
		//Imprimer en consola el cubo de los elementos
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		//Forma tradicional
		list.stream()
			.map(value -> Estaticos.toCube(value))
			.forEach(value -> System.out.println(value));
		
		//Metodo por referencia a metodos estaticos
		list.stream()
			.map( Estaticos::toCube )
			.forEach( System.out::println );
	}
	
	public static int toCube(int number) {
		return number * number * number;
	}
}
