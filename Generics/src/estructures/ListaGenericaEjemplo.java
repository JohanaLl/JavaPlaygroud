package estructures;

import java.util.ArrayList;
import java.util.List;

public class ListaGenericaEjemplo {

	public static void main (String[] args) {
		/**
		 * NO GENERIC
		 */
		List lista = new ArrayList();
		lista.add("No Generic");
		lista.add(123);
		String texto = (String) lista.get(0); // Necesitas casting
		Integer num = (Integer) lista.get(1); // Necesitas casting
		
		/**
		 * GENERIC
		 */
		List<String> list = new ArrayList<>();
		list.add("Generic");
		String text = list.get(0);
		
		for (String element : list) {
			System.out.println(element);
		}
		System.out.println(texto);
		System.out.println(num);
		
	}
}
