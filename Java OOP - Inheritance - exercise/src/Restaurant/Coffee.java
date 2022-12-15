package Restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {
    double COFFEE_MILLiLTERS = 50;
    BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    double caffeine;
    public Coffee(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }

    public double getCaffeine() {
        return caffeine;
    }
}
