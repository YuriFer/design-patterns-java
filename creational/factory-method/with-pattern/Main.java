public class Main {

    public static void main(String[] args) {
        NotificationService.send(NotificationType.EMAIL, "Welcome!");
        NotificationService.send(NotificationType.SMS, "Your code is 1234");
        NotificationService.send(NotificationType.PUSH, "New message received");
    }
}
