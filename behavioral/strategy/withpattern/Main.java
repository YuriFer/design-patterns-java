package behavioral.strategy.withpattern;

public class Main {

    public static void main(String[] args) {

        PaymentService creditCardPayment =
                new PaymentService(new CreditCardPayment());

        creditCardPayment.process(100.0);

        PaymentService pixPayment =
                new PaymentService(new PixPayment());

        pixPayment.process(50.0);
    }
}

