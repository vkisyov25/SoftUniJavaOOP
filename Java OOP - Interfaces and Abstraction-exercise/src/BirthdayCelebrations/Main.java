package BirthdayCelebrations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Citizen> citizenList = new ArrayList<>();
        List<Robot> robotList = new ArrayList<>();
        List<Pet> petList = new ArrayList<>();


        while(!command.equals("End")){
            String[] arr = command.split(" ");

            String name = arr[0];
            if(name.equals("BirthdayCelebrations.FoodShortage.Citizen")){
                Citizen citizen = new Citizen(arr[1],Integer.parseInt(arr[2]),arr[3],arr[4]);
                citizenList.add(citizen);
            }
            if(name.equals("BirthdayCelebrations.Robot")){
                Robot robot = new Robot(arr[1],arr[2]);
                robotList.add(robot);
            }
            if(name.equals("BirthdayCelebrations.Pet")){
                Pet pet = new Pet(arr[1],arr[2]);
                petList.add(pet);
            }

            command = scanner.nextLine();
        }
        String year = scanner.nextLine();

        boolean haveOutput = true;
        for(int i=0; i<citizenList.size(); i++){
            if(citizenList.get(i).getBirthDate().contains(year)) {
                System.out.println(citizenList.get(i).getBirthDate());
                haveOutput =false;
            }
        }

        for(int i=0; i<petList.size(); i++){
            if(petList.get(i).getBirthDate().contains(year)) {
                System.out.println(petList.get(i).getBirthDate());
                haveOutput = false;
            }
        }

        if(haveOutput){
            System.out.println("<no output>");
        }



    }
}
