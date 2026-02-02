package behavioral.strategy.withpattern;

public class PixPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Processing PIX payment of amount: " + amount);
    }
    
}
