package estructures;

import java.util.List;

public class Utility {

	public static <T> void printArray(T[] array) {
		for (T item : array) {
			System.out.println(item + " ");
		}
		System.out.println();
	}
	
	/**
	 * ? extends : comodin con limite superior
	 * types byte, double, float, int, long, and short
	 * @param numbers
	 */
	public static void printNumbers(List<? extends Number> numbers) {
		for (Number num : numbers) {
			System.out.println(num);
		}
	}
	
	/**
	 * ? super : comidin con limite inferior
	 * @param list
	 */
	public static void addNumbers(List<? super Integer> list) {
		list.add(42);
	}
}
