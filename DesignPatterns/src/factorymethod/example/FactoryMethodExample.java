package factorymethod.example;

public class FactoryMethodExample {

	public static void main(String[] args) {
		NotificationFactory factory = new EmailNotificationFactory();
        System.out.println("Email: ");
        factory.sendNotification();

        factory = new SMSNotificationFactory();
        factory.sendNotification();

        factory = new PushNotificationFactory();
        factory.sendNotification();
	}
}
