package creational.abstracfactory.factories;

import creational.abstracfactory.products.Helicopter;
import creational.abstracfactory.products.Plane;

public interface AbstractFactory {

	public Plane createPlane(String type);
	public Helicopter createHelicopter(String type);
}
