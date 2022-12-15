package AbstractionSoftUni.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int bottomLeftX = arr[0];
        int bottomLeftY = arr[1];
        Point bottomLeft = new Point(bottomLeftX,bottomLeftY);

        int topRightX = arr[2];
        int topRightY = arr[3];
        Point topRight = new Point(topRightX,topRightY);

        Rectangle rectangle = new Rectangle(bottomLeft,topRight);

        int n = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<n; i++){
            int[] currentCordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

            Point current = new Point(currentCordinates[0],currentCordinates[1]);

            System.out.println(rectangle.cointains(current));
        }



    }
}
