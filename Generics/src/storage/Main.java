package storage;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//Crear almacenes
		Storage<Book> bookStorage = new Storage<>();
		Storage<Disk> diskStorage = new Storage<>();
		Storage<Shirt> shirtStorage = new Storage<>();
		
		//Agregar elementos
		bookStorage.addItem(new Book(1, "Insomnia"));
		bookStorage.addItem(new Book(2, "1984"));
		
		diskStorage.addItem(new Disk(1, "Abbey Road"));
		diskStorage.addItem(new Disk(2, "Back in Black"));
		
		shirtStorage.addItem(new Shirt(1, "Red Shirt"));
		shirtStorage.addItem(new Shirt(2, "Blue Shirt"));
		
		//Crear una lista de almacenes
		List<Storage<?>> storages = new ArrayList<>();
		storages.add(bookStorage);
		storages.add(diskStorage);
		storages.add(shirtStorage);
		
		//Calcular el total de elementos
		int totalItems = Utils.getTotalItems(storages);
		System.out.println("Total items in all storages: " + totalItems);
		
		//Mostrar elementos usando wildcards
		System.out.println("Display items in all storages: ");
		Utils.displayItems(storages);
	}
}
