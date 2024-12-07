package openClose;

public class PremiumDiscount extends Discount{

	@Override
	public double calculate(double amount) {
		return amount * 0.2;
	}

}
