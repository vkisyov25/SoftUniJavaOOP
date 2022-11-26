package FoodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleNum = Integer.parseInt(scanner.nextLine());

        List<Citizen> citizenList = new ArrayList<>();
        List<Rebel> rebelList = new ArrayList<>();
        for (int i = 0; i < peopleNum; i++) {
            String[] arr = scanner.nextLine().split(" ");

            if (arr.length > 3) {
                Citizen citizen = new Citizen(arr[0], Integer.parseInt(arr[1]), arr[2], arr[3]);
                citizenList.add(citizen);
            } else {
                Rebel rebel = new Rebel(arr[0], Integer.parseInt(arr[1]), arr[2]);
                rebelList.add(rebel);
            }
        }
        String name = scanner.nextLine();
        int amountFood =0;
        while (!name.equals("End")){

            for(int j=0; j<citizenList.size(); j++){
                if(citizenList.get(j).getName().equals(name)){
                    amountFood +=10;
                }
            }

            for(int j=0; j<rebelList.size(); j++){
                if(rebelList.get(j).getName().equals(name)){
                    amountFood +=5;
                }
            }


            name = scanner.nextLine();
        }

        System.out.println(amountFood);

    }
}
