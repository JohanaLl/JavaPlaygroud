package storage;

import java.util.List;

public class Utils {
	
	public static int getTotalItems(List<? extends Storage<?>> storages) {
		int total = 0;
		for (Storage<?> storage : storages) {
			total += storage.getItems().size();
		}
		return total;
	}
	
	public static void displayItems(List<? extends Storage<?>> storages) {
		for (Storage<?> storage : storages) {
			System.out.println("Items in storage: " + storage.getItems());
		}
	}

}
