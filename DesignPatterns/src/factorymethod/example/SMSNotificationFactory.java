package factorymethod.example;

public class SMSNotificationFactory extends NotificationFactory{

	@Override
	Notification createNotification() {
		return new SMSNotification();
	}
}
