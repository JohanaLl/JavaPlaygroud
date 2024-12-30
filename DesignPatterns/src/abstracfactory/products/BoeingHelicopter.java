package abstracfactory.products;

public class BoeingHelicopter implements Helicopter{

	@Override
	public void create() {
		System.out.println("Boeing Helicopter manufacture");
		System.out.println("------------------------");
	}

}
