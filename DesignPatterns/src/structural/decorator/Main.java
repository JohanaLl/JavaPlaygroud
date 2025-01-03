package structural.decorator;

/*
 * Patrón que permite añadir nuevas funcionalidades a un objeto en tiempo de ejecución sin modificar su 
 * estructura y a través de una envoltura (wrapper). El decorador envuelve la clase original sin 
 * cambiar la firma de los métodos existentes. 
 */
public class Main {

	public static void main(String[] args) {
		
		Pizza pizza = new PlainPizza();
		
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getPrice());
		
		Pizza withTomatiSauce = new TomatoSauce(pizza);
		
		System.out.println(withTomatiSauce.getDescription());
		System.out.println(withTomatiSauce.getPrice());
		
		Pizza withMozzarella = new Mozzarella(withTomatiSauce);
		System.out.println(withMozzarella.getDescription());
		System.out.println(withMozzarella.getPrice());
	}
}
