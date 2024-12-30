package creational.abstracfactory.products;

public class BoeingPlane implements Plane{

	@Override
	public void create() {
		System.out.println("Boeing plane manufacture");
		System.out.println("------------------------");
	}

}
