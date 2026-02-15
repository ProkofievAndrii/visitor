package domain;

public abstract class AbstractItem implements Item {
    private final double basePrice;

    protected AbstractItem(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
