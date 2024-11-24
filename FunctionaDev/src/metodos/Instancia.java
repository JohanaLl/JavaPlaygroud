package metodos;

import java.util.Arrays;
import java.util.List;

public class Instancia {

	public static void main(String[] args) {
		
		//Referencia a métodos de instancia
		
		//Imprimer en consola el cubo de los elementos
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		Calculadora calculadora = new Calculadora();
		
		list.stream()
			.map( calculadora::toCube )
			.forEach( System.out::println );
	}
}
