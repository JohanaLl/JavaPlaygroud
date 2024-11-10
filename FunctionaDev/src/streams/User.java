package streams;

public class User {

	private String name;
	private int edad;
	
	/**
	 * @param name
	 * @param edad
	 */
	public User(String name, int edad) {
		this.name = name;
		this.edad = edad;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", edad=" + edad + "]";
	}
}
