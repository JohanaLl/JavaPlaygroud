package streams;

public class Book {

	private String title;
	private int copies;
	
	/**
	 * @param title
	 * @param copies
	 */
	public Book(String title, int copies) {
		this.title = title;
		this.copies = copies;
	}
	
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the copies
	 */
	public int getCopies() {
		return copies;
	}
	/**
	 * @param copies the copies to set
	 */
	public void setCopies(int copies) {
		this.copies = copies;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", copies=" + copies + "]";
	}
}
