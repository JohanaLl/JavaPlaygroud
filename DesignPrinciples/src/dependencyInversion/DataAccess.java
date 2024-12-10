package dependencyInversion;

import java.util.List;

import singleResponsability.User;

public class DataAccess {

	private Connection connection;
	
	public DataAccess(Connection connection) {
		this.connection = connection;
	}
	
	public List<User> getData() {
		return connection.getData();
	}
}
