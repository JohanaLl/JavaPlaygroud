package storage;

import java.util.ArrayList;
import java.util.List;

public class Storage<T> {

	private List<T> items;
	
	public Storage() {
		items = new ArrayList<>();
	}
	
	/**
	 * Agregar elementos al almacen
	 */
	public void addItem(T item) {
		items.add(item);
	}
	
	/**
	 * Eliminar elementos del alamcen
	 */
	public void removeItem(T item) {
		items.remove(item);
	}
	
	/**
	 * Obtener todos los elementos
	 */
	public List<?> getItems() {
		return items;
	}
	
	/**
	 * Mostrar todos los elementos
	 */
	public void showAll() {
		System.out.println("Elementos en el almacen: " + items);
	}
	
}
