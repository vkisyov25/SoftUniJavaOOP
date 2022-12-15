package AbstractionSoftUni.HotelReservation;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"{pricePerDay} {numberOfDays} {season} {discountType}"
        String[] arr = scanner.nextLine().split(" ");

        double pricePerDay = Double.parseDouble(arr[0]);
        int numberOfDays = Integer.parseInt(arr[1]);
        Season currentSeason = Season.valueOf(arr[2]);
        DiscountType discountType = DiscountType.valueOf(arr[3]);

        double finalPrice = PriceCalculator.calculateFinalPrice(pricePerDay,numberOfDays,currentSeason,discountType);

        System.out.printf("%.2f",finalPrice);

    }
}
