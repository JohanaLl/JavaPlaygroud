package creational.abstracfactory.factories;

import creational.abstracfactory.products.AirbusHelicopter;
import creational.abstracfactory.products.AirbusPlane;
import creational.abstracfactory.products.Helicopter;
import creational.abstracfactory.products.Plane;

public class AirbusFactory implements AbstractFactory {

	@Override
	public Plane createPlane(String type) {
		System.out.println("Creating Airbus plain " + type + "...");
		return new AirbusPlane();
	}

	@Override
	public Helicopter createHelicopter(String type) {
		System.out.println("Creating Airbus helicopter " + type + "...");
		return new AirbusHelicopter();
	}

}
