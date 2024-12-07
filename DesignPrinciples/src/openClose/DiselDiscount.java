package openClose;

public class DiselDiscount extends Discount{

	@Override
	public double calculate(double amount) {
		return amount * 0.5;
	}

	
}
