package strategy.paymentgateway.payments.strategy;

public class UPIPaymentStrategy implements PaymentStrategy{

    @Override
    public void proceedPayment(int amount) {
        System.out.println("Proceeding with UPI as an payment option ");
    }

}
