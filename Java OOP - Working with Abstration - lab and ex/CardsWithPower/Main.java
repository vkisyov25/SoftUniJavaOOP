package AbstractionSoftUni.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();

        int powers = Rank.valueOf(rank).getPowers();
        int values = Suits1.valueOf(suit).getSuitsPower();
        int result = powers + values;

        System.out.printf("Card name: %s of %s; Card power: %d",rank,suit,result);
    }
}
