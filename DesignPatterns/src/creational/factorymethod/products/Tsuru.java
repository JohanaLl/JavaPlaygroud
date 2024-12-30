package creational.factorymethod.products;

public class Tsuru extends Car{

	public Tsuru() {
		super("Tsuru", 150000, "Nissan");
	}

	@Override
	public String toString() {
		return "Name:" + getName() + ", Price:" + getPrice() + ", Agency:" + getAgency();
	}

}
