package storage;

public class Book {

	private int id;
	private String title;
	
	/**
	 * @param id
	 * @param title
	 */
	public Book(int id, String title) {
		this.id = id;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + "]";
	}

}
