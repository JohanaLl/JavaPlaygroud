package abstracfactory.factories;

import abstracfactory.products.AirbusHelicopter;
import abstracfactory.products.AirbusPlane;
import abstracfactory.products.Helicopter;
import abstracfactory.products.Plane;

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
