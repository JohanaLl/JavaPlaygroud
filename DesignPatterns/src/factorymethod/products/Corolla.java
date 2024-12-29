package factorymethod.products;

public class Corolla extends Car {

	public Corolla() {
		super("Corolla", 300000, "Toyota");
	}

	@Override
	public String toString() {
		return "Name:" + getName() + ", Price:" + getPrice() + ", Agency:" + getAgency();
	}
}
