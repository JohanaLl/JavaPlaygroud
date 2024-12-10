package dependencyInversion;

import java.util.List;

import singleResponsability.User;

public interface Connection {

	public List<User> getData();
}
