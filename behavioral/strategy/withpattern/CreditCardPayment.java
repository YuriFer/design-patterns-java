package behavioral.strategy.withpattern;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment: " + amount);
    }
}
