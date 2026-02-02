package behavioral.strategy.withpattern;

public class BoletoPayment implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Processing boleto payment: " + amount);
    }
}

