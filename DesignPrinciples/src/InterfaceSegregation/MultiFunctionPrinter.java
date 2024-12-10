package InterfaceSegregation;

public class MultiFunctionPrinter implements Printer, Scanner, Fax {

	@Override
	public void faxDocument() {
		System.out.println("Faxing document");			
	}

	@Override
	public void scanDocument() {
		System.out.println("Scaning document");		
	}

	@Override
	public void printDocument() {
		System.out.println("Printing document");			
	}
}
