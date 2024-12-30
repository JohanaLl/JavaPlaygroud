package behavioral.observer;

public interface Subject {

	//Agregar suscriptores
    public void attach(int eventTpye, Observer observer);

    //Elimina suscriptores
    public void detach(int eventTpye, Observer observer);

    //Notifica cambios a los suscriptores 
    public void notifyObserver(int eventTpye, Event event);
}
