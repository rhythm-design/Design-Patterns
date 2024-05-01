package strategy.paymentgateway.payments.strategy;

import strategy.paymentgateway.payments.discount.Discount;

public class CreditCardPaymentStrategy implements PaymentStrategy{

    private Discount discount;

    public CreditCardPaymentStrategy() {
        this.discount = new Discount(0.0f, 0);
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @Override
    public void proceedPayment(int amount) {
        if(discount.getDiscountPercent() > 0.0f && discount.getMaxDiscount() > 0){
            System.out.println("Proceeding with credit card as payment option with discount as " +
                    discount.calculateDiscount(amount));
        }else{
            System.out.println("Proceeding with credit card as payment option with no discount");
        }
    }

}
