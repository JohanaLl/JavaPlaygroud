package abstracfactory.factories;

import abstracfactory.products.Helicopter;
import abstracfactory.products.Plane;

public interface AbstractFactory {

	public Plane createPlane(String type);
	public Helicopter createHelicopter(String type);
}
