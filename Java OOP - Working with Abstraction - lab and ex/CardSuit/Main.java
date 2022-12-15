package AbstractionSoftUni.CardSuit;

public class Main {
    public static void main(String[] args) {
        Suits[] enumArr;
        for (int i=0; i<Suits.values().length; i++){
            enumArr = Suits.values();
            Suits suits = Suits.valueOf(String.valueOf(enumArr[i]));
            System.out.printf("Ordinal value: %d; Name value: %s\n",suits.getValues(),suits);
        }
    }


}
