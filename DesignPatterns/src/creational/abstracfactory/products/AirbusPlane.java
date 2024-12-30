package creational.abstracfactory.products;

public class AirbusPlane implements Plane{

	@Override
	public void create() {
		System.out.println("Airbus plane manufacture");
		System.out.println("------------------------");
	}

}
