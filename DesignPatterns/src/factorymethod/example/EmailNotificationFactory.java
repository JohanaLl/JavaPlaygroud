package factorymethod.example;

public class EmailNotificationFactory extends NotificationFactory {

	@Override
	Notification createNotification() {
		return new EmailNotification();
	}

}
