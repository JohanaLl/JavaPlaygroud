package abstracfactory.factories;

import abstracfactory.products.BoeingHelicopter;
import abstracfactory.products.BoeingPlane;
import abstracfactory.products.Helicopter;
import abstracfactory.products.Plane;

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
