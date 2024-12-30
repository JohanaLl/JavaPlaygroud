package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.handler.Handler;
import behavioral.chainofresponsibility.handler.UserExistsHandler;
import behavioral.chainofresponsibility.handler.UserNotExpiredHandler;
import behavioral.chainofresponsibility.handler.ValidPasswordHandler;

/*
 * Este patrón permite delegar una operación a lo largo de una cadena de objetos hasta 
 * encontrar al eslabón que puede realizar la acción. Su diseño permite la generación de 
 * cadenas dinámicas durante la ejecución del programa, cambiando el comportamiento del componente.
 */
public class Main {

    public static void main(String[] args) {
        // Permite adicionar, remover o reordenar handlers de forma dinamica

        Database database = new Database();
        Handler handler = new UserExistsHandler(database);

        // Si algun handler retorna false, se rombe el chain y valida la regla
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new UserNotExpiredHandler());

        AutenticacionService service = new AutenticacionService(handler);
        if (service.logIn("admin", "admin_password")) {
            System.out.println("Log In successfully!");
        }
    }
}
