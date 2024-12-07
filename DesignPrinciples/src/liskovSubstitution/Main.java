package liskovSubstitution;

/**
 * Liskov susbstitution (Sustitución de Liskov)
 * Una clase debería ser sustituible por su clase padre, la clase heredada debe 
 * complementar no reemplazar el comportamiento de la clase base
 */
public class Main {

	public static void main(String[] args) {
		Car[] cars = {
				new Ferrary(),
				new Tesla()
		};
		
		printCarSeats(cars);
	}
	
	public static void printCarSeats(Car[] cars) {
		for (Car car: cars) {
			System.out.println(car.numSeats());
		}
	}
}
