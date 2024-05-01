package strategy.paymentgateway;

import strategy.paymentgateway.payments.discount.Discount;
import strategy.paymentgateway.payments.strategy.CreditCardPaymentStrategy;
import strategy.paymentgateway.payments.strategy.UPIPaymentStrategy;
import strategy.paymentgateway.processor.PaymentGateway;

public class PaymentGatewayRunner {

    public static void main(String[] args) {

        // Proceed with UPI as payment option
        UPIPaymentStrategy upiPaymentStrategy = new UPIPaymentStrategy();
        PaymentGateway paymentGateway = new PaymentGateway(upiPaymentStrategy);
        paymentGateway.proceedPayment(10000);
        System.out.println();
        // If user changes to Credit card, then
        CreditCardPaymentStrategy creditCardPaymentStrategy = new CreditCardPaymentStrategy();
        paymentGateway.setPaymentStrategy(creditCardPaymentStrategy);
        paymentGateway.proceedPayment(10000);
        System.out.println();
        // Bank is running offer, give discount to bank users
        System.out.println("Bank is giving offer on payments through Credit Card");
        Discount discount = new Discount(7.5f, 500);
        creditCardPaymentStrategy.setDiscount(discount);
        paymentGateway.proceedPayment(10000);
        System.out.println();
        // Sale ended from bank side, remove the discount
        System.out.println("Bank Offer ended, remove discount from card");
        discount.resetDiscount();
        paymentGateway.proceedPayment(10000);
    }
}
