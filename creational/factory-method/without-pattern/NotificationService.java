public class NotificationService {

    public static void send(NotificationType type, String message) {

        if (type == NotificationType.EMAIL) {
            System.out.println("Sending EMAIL: " + message);

        } else if (type == NotificationType.SMS) {
            System.out.println("Sending SMS: " + message);

        } else if (type == NotificationType.PUSH) {
            System.out.println("Sending PUSH notification: " + message);

        } else {
            throw new IllegalArgumentException("Notification type not supported");
        }
    }

    public static void main(String[] args) {
        NotificationService.send(NotificationType.EMAIL, "Olá, este é um email de teste!");
        NotificationService.send(NotificationType.SMS, "Olá, este é um SMS de teste!");
        NotificationService.send(NotificationType.PUSH, "Olá, esta é uma notificação push de teste!");
    }
}