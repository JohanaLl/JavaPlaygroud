package factorymethod;

import factorymethod.cars.CarsFactory;
import factorymethod.cars.NissanFactory;
import factorymethod.cars.ToyotaFactory;
import factorymethod.products.Car;

/**
 * Patron creacional que provee una interfaz o clase abstracta (creator) que 
 * permite encapsular la logica de creación de los objetos en subclases.
 * Las subclases deciden que clase instanciar.
 * Los objetos se crean a partir de un metodo y no a través de un constructor
 * como se hace normalmente
 */
public class Main {

	public static void main(String[] args) {
		CarsFactory factory;
		Car carCreated;
		
		factory = new NissanFactory();
		
		System.out.println("For Tsuru: ");
		carCreated = factory.createProduct("tsuru");
		if (carCreated != null) 
			System.out.println(carCreated.toString());
		else 
			System.out.println("No product crated.");
		
		System.out.println("For Versa: ");
		carCreated = factory.createProduct("versa");
		if (carCreated != null) 
			System.out.println(carCreated.toString());
		else 
			System.out.println("No product crated.");
		
		factory = new ToyotaFactory();
		System.out.println("For Corolla: ");
		carCreated = factory.createProduct("corolla");
		if (carCreated != null)
			System.out.println(carCreated.toString());
		else 
			System.out.println("No product crated.");
		
		System.out.println("For Versa: ");
		carCreated = factory.createProduct("versa");
		if (carCreated != null) 
			System.out.println(carCreated.toString());
		else 
			System.out.println("No product crated.");
	}
}
