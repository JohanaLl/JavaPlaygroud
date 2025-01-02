package storage;

public class Disk {

	private int id;
	private String album;
	
	/**
	 * @param id
	 * @param album
	 */
	public Disk(int id, String album) {
		this.id = id;
		this.album = album;
	}

	@Override
	public String toString() {
		return "Disk [id=" + id + ", album=" + album + "]";
	}
	
}
