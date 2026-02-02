public class PaymentService {

    public void processPayment(String method, double amount) {

        if (method.equals("CREDIT_CARD")) {
            System.out.println("Processing credit card payment: " + amount);

        } else if (method.equals("PIX")) {
            System.out.println("Processing PIX payment: " + amount);

        } else if (method.equals("BOLETO")) {
            System.out.println("Processing boleto payment: " + amount);

        } else {
            throw new IllegalArgumentException("Payment method not supported");
        }
    }
}
