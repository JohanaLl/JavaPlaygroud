package factorymethod.products;

public class Camry extends Car {

	public Camry() {
		super("Camry", 500000, "Toyota");
	}

	@Override
	public String toString() {
		return "Name:" + getName() + ", Price:" + getPrice() + ", Agency:" + getAgency();
	}
}
