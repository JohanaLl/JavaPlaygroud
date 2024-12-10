package InterfaceSegregation;

/**
 * Interface segregation (Segregación de interfaces)
 * 
 * Ninguna clase debe verse obligada a depender de métodos que no utiliza. Es preferible
 * contar con muchas interfaces con pocos métodos que tener una interfaz que requiera
 * implementar metodos que no serán usados
 */
public class Main {

	public static void main(String[] args) {
		Printer simplePrinter = new SimplePrinter();
		simplePrinter.printDocument();
		
		MultiFunctionPrinter mpf = new MultiFunctionPrinter();
		mpf.printDocument();
		mpf.scanDocument();
		mpf.faxDocument();
	}
}
