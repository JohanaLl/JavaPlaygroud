package factorymethod.cars;

import factorymethod.products.Car;

public interface CarsFactory {

	public Car createProduct(String productName);
}
