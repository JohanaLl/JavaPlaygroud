package creational.abstracfactory;

import creational.abstracfactory.factories.AbstractFactory;
import creational.abstracfactory.factories.AirbusFactory;
import creational.abstracfactory.factories.BoeingFactory;
import creational.abstracfactory.products.Helicopter;
import creational.abstracfactory.products.Plane;

/**
 * Patron creacional que permite crear familias de objetos sin tener que especificar
 * la clase concreta usando interfaces, es similar al factory method, pero esta vez,
 * se crean familias o grupos de factorias (factoria de factorias) por lo que se tienen
 * varios metodos de creación en vez de uno solo
 */
public class Main {

	public static void main(String[] args) {
		//Fabricas de Airbus
		AbstractFactory airbus = new AirbusFactory();
		Plane airbusPlane = airbus.createPlane("A380");
		airbusPlane.create();
		
		Helicopter airbusHelicopter = airbus.createHelicopter("H160");
		airbusHelicopter.create();
		
		//Fabricas de Boring
		AbstractFactory boeing = new BoeingFactory();
		Plane boeingPlane = boeing.createPlane("B747");
		boeingPlane.create();
		
		Helicopter boeingHelicopter = boeing.createHelicopter("CH-47");
		boeingHelicopter.create();
	}
}
