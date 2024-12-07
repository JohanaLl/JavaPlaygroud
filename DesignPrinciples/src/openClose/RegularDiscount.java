package openClose;

public class RegularDiscount extends Discount{

	@Override
	public double calculate(double amount) {
		return amount * 0.1;
	}

}
