package strategy.paymentgateway.processor;

import strategy.paymentgateway.payments.strategy.PaymentStrategy;

public class PaymentGateway {

    // favor composition over inheritance, due to this, we can switch behavior at runtime
    // PaymentStrategy is an interface, and we can have multiple implementations of it
    // We can inject any strategy as per the need during runtime.
    // Try Running PaymentGatewayRunner.java file to see how this will work
    private PaymentStrategy paymentStrategy;

    public PaymentGateway(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void proceedPayment(int amount){
        paymentStrategy.proceedPayment(amount);
    }
}
