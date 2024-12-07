package openClose;

/**
 * Open/Close (Abierto/Cerrado)
 * 
 * Las clase módulos o funciones deben estar abiertas para su extención pero cerradas a su
 * modificación. Se debería poder extender el comportamiento de una clase sin modificarla
 */
public class Main {
	
	public static void main(String[] args) {
		
		Discount regularDiscount = new RegularDiscount();
		Discount premiumDiscount = new PremiumDiscount();
		Discount diselDiscount = new DiselDiscount();
		
		DiscountCalculator calculator = new DiscountCalculator();
		
		double regularDiscountAmount = calculator.calculateDiscount(regularDiscount, 100);
		double premiumDiscountAmount = calculator.calculateDiscount(premiumDiscount, 100);
		double diselDiscountAmount = calculator.calculateDiscount(diselDiscount, 100);
		
		System.out.println("Regular discount " + regularDiscountAmount);
		System.out.println("Premium discount " + premiumDiscountAmount);
		System.out.println("Disel discount " + diselDiscountAmount);
	}

}
