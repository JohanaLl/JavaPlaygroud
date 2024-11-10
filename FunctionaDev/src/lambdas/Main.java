package lambdas;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {1, 5, 8, 4, 6, 20};
		
		ISaludar saludar = user -> System.out.println("Hola Mundo " + user); 
		saludar.Saludar("Codi");
		
		ISaludar saludarDos = name -> {
			
			if (name.equals("Codi"))
				System.out.println("Hola Codi! Tienes el mismo nombre que la mascota de CF");
			else 
				System.out.println("Hola Muindo " + name);
		};
		
		saludarDos.Saludar("Codis");
		
		ISuma suma = (val1, val2) -> val1 + val2;
		int result = suma.suma(10, 20);
		System.out.println(result);
		
		suma = (val1, val2) -> {
			
			int sum = val1 + val2;
			System.out.println("El resultado de la expreseión es " + sum);
			return sum;
		};
		
		result = suma.suma(100, 200);
		System.out.println(result);
		
		//Crear una función anónima que nos permita calcular el promedio de un arreglo de números enteros.
		IAverage average = arr -> {
			double sum = 0;
			
			for (int num : arr) {
				sum += num;
			}
			return sum / nums.length;
		};
		
		double ave = average.average(nums);
		System.out.println("Promedio " + ave);
		
		//Crear una función anónima que calcule el factorial dado un número entero.
		IFactorial factorial = num -> {
			int fact = 1, numSec = 0;
			for (int i = 0; i < num; i++) {
				if (num == 0) {
					fact = 0;
				} else if (num < 0) {
					fact = 0;
				} else {
					numSec = num - i;
					fact = fact * numSec;
				}
			} 
			
			return fact;
		};
		
		int numFacto = factorial.calcularFactorial(7);
		System.out.println("Factorial " + numFacto);
		
		//Crear una función anónima que permita conocer si un número es par.
		IEven isEven = num -> num % 2 == 0 ? "Es par" : "Es impar";
		String EvenOdd = isEven.isEven(18);
		System.out.println(EvenOdd);
		
		//Dado un arreglo de números enteros, crear una función anónima que retorne el número mayor.
		IGrater grater = arr -> {
			int great = arr[0];
			for (int i : arr) {
				if (i > great) {
					great = i;
				}
			}
			
			return great;
		};
		
		System.out.println("El numero mayor es " + grater.grater(nums));
		
//		Crear una función anónima que reciba como parámetro 3 numeros enteros. La función retorna el número mayor.
		IGreatNum great = (a, b, c) -> a > b ? (a > c ? a : c) : (b > c ? b : c);
		int greatNum = great.greaterNum(50, 33, 22);
		System.out.println("El número mayor es: " + greatNum);
	}
}
