package InterfaceSegregation;

public class SimplePrinter implements Printer {

	@Override
	public void printDocument() {
		System.out.println("Printing document");		
	}

}
