package discount;

public interface DiscountStrategy {
    double applyDiscount(double billAmount);
}

class SaleDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double billAmount) {
        return billAmount - (billAmount * 0.1);
    }
}

class DiscountDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double billAmount) {
        return billAmount - (billAmount * 0.5);
    }
}

class LiquidationDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double billAmount) {
        return billAmount - (billAmount * 0.75);
    }
}