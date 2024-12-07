package singleResponsability;

/***
 * Single responsability (Responsabilidad unica)
 * 
 * Cada modulo o clase debería tener una sola responsabilidad, esto también se puede interpretar
 * como tener una y solo una razón para cambiar. El componente/función/clase debe hacer muy bien
 * una sola cosa
 */

public class UserRepository {

	User saveUser(User user) {
		//Guardar al usaurio
	}
	
	void deleteUser(User user) {
		//Borrar al usaurio
	}
}
