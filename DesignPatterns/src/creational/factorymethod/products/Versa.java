package creational.factorymethod.products;

public class Versa extends Car{

	public Versa() {
		super("Vesa", 350000, "Nissan");
	}
	
	@Override
	public String toString() {
		return "Name:" + getName() + ", Price:" + getPrice() + ", Agency:" + getAgency();
	}

}
