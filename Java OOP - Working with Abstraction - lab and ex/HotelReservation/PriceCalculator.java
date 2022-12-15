package AbstractionSoftUni.HotelReservation;

public class PriceCalculator {

    public static double calculateFinalPrice(double pricePerDay, int numberOfDays,Season season, DiscountType discountType){
        double price = pricePerDay * numberOfDays;
        price = price * season.getMultipleNum();
        price = price * (100 - discountType.getPercent())/100.0;

        return price;
    }
}
