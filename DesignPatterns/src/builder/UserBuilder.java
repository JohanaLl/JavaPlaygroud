package builder;

public class UserBuilder {

	private String name;
	private String lastName;
	private int age;
	private String address;
	private String phone;
	private String email;

	/**
	 * @param name the name to set
	 */
	public UserBuilder name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public UserBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * @param age the age to set
	 */
	public UserBuilder age(int age) {
		this.age = age;
		return this;
	}

	/**
	 * @param address the address to set
	 */
	public UserBuilder address(String address) {
		this.address = address;
		return this;
	}

	/**
	 * @param phone the phone to set
	 */
	public UserBuilder phone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * @param email the email to set
	 */
	public UserBuilder email(String email) {
		this.email = email;
		return this;
	}

	// Método build para crear el objeto final
	public User build() {
		return new User(name, lastName, age, address, phone, email);
	}
}
