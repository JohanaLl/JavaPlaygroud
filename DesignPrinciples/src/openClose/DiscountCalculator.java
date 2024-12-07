package openClose;

/**
 * Responsabilidad de hacer el calculo
 */
public class DiscountCalculator {

	public double calculateDiscount(Discount discount, double amount) {
		return discount.calculate(amount);
	}
}
