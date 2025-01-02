package estructures;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//Reutilización de código
		Stack<String> texto = new Stack<>();
		texto.push("Hola mundo");
		
		Stack<Integer> number = new Stack<>();
		number.push(123456);
		number.push(789635);
		
//		System.out.println(number);
//		System.out.println(texto);
		
		Integer[] intArray = {1, 2, 3, 4};
		String[] strArray = {"Hola", "Mundo"};
		
		Utility.printArray(intArray);
		Utility.printArray(strArray);
		
		//Solo acepta subclases
		List<Integer> integers = List.of(1, 2, 3);
		List<Double> doubles = List.of(1.1, 2.2, 3.3);
		List<String> strings = List.of("Hola", "Mundo"); // no permitido
		
		Utility.printNumbers(integers);
		Utility.printNumbers(doubles);
		
		//Acepta superclases. Number is superclass of Integer
		List<Number> numbers = new ArrayList<>();
		Utility.addNumbers(numbers); //funciona
	}
}
