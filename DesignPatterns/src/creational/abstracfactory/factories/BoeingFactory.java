package creational.abstracfactory.factories;

import creational.abstracfactory.products.BoeingHelicopter;
import creational.abstracfactory.products.BoeingPlane;
import creational.abstracfactory.products.Helicopter;
import creational.abstracfactory.products.Plane;

public class BoeingFactory implements AbstractFactory {

	@Override
	public Plane createPlane(String type) {
		System.out.println("Creating Boeing plain " + type + "...");
		return new BoeingPlane();
	}

	@Override
	public Helicopter createHelicopter(String type) {
		System.out.println("Creating Boeing Helicopter " + type + "...");
		return new BoeingHelicopter();
	}

}
