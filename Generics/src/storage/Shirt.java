package storage;

public class Shirt {

	private int id;
	private String size;
	
	/**
	 * @param id
	 * @param size
	 */
	public Shirt(int id, String size) {
		this.id = id;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Shirt [id=" + id + ", size=" + size + "]";
	}

}
