package pointofsales;

public class QuantityDiscount implements DiscountStrategy{
    private double discountRate;
    private int minimumQty;
    
    public QuantityDiscount(double discountRate, int minimumQty) {
        this.discountRate = discountRate;
        this.minimumQty = minimumQty;
    } 

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getMinimumQty() {
        return minimumQty;
    }

    public void setMinimumQty(int minimumQty) {
        this.minimumQty = minimumQty;
    }
 
    public double getDiscountAmt(double unitCost, int qty) {
        return getDiscountRate() * (unitCost * qty);
    }
    
}
