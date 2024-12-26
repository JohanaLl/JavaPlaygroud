package builder;

public class User {

	private String name;
	private String lastName;
	private int age;
	private String address;
	private String phone;
	private String email;
	
	public User(String name, String lastName, int age, String address, String phone, String email) {
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
}
