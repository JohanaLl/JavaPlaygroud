package factorymethod.cars;

import factorymethod.products.Camry;
import factorymethod.products.Car;
import factorymethod.products.Corolla;

public class ToyotaFactory implements CarsFactory {

	@Override
	public Car createProduct(String productName) {
		Car car = null;
		
		if (productName.equalsIgnoreCase("CAMRY")) {
			car = new Camry();
		} else if (productName.equalsIgnoreCase("COROLLA")) {
			car = new Corolla();
		}
		return car;
	}

}
