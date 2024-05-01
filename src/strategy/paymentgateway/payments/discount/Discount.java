package strategy.paymentgateway.payments.discount;

public class Discount {

    private float discountPercent;

    private int maxDiscount;

    public float getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(float discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(int maxDiscount) {
        this.maxDiscount = maxDiscount;
    }

    public int calculateDiscount(int amount){
        int discount = (int) ((discountPercent / 100.0) * amount);
        return Math.min(discount, maxDiscount);
    }

    public Discount(float discountPercent, int maxDiscount) {
        this.discountPercent = discountPercent;
        this.maxDiscount = maxDiscount;
    }

    public void resetDiscount(){
        this.setMaxDiscount(0);
        this.setDiscountPercent(0.0f);
    }
}
