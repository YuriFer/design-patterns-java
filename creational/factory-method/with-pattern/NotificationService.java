public class NotificationService {

    public void send(NotificationType type, String message) {

        Notification notification = NotificationFactory.createNotification(type);
        notification.send(message);
    }
}
