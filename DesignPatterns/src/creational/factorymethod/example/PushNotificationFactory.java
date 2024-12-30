package creational.factorymethod.example;

public class PushNotificationFactory extends NotificationFactory {

	@Override
	Notification createNotification() {
		return new PushNotification();
	}

}
