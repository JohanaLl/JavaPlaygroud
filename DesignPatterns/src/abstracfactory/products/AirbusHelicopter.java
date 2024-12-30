package abstracfactory.products;

public class AirbusHelicopter implements Helicopter{

	@Override
	public void create() {
		System.out.println("Airbus Helicopter manufacture");
		System.out.println("------------------------");
	}

}
