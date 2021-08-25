/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.util.*;

public class AreaCalculator {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n\n---------------------------------");
            System.out.println("\n  A R E A   C A L C U L A T O R\n");
            System.out.println("---------------------------------\n");
            System.out.println("[01] : Area of Circle");
            System.out.println("[02] : Area of Pentagon");
            System.out.println("[03] : Area of Triangle");
            System.out.println("[04] : Area of Square");
            System.out.println("[05] : Area of Rectangle\n");
            System.out.println("[-1] : Exit\n");
            System.out.println("---------------------------------\n\n");
            System.out.println("Enter your choice :\n");
            int choice = input.nextInt();
            if (choice == -1) {
                input.close();
                System.out.println("\nExiting...\n\n");
                return;
            }
            double area = 0;
            switch (choice) {
                case 1:
                    System.out.print("\nFormula : pi * R * R\n\n\nEnter Radius : ");
                    double radius = input.nextDouble();
                    area = 3.14 * radius * radius;
                    break;
                case 2:
                    System.out.print("\nFormula : 1.720477 * S * S\n\n\nEnter Side Length : ");
                    double sideLength = input.nextDouble();
                    area = 1.720477 * sideLength * sideLength;
                    break;
                case 3:
                    System.out.print("\nFormula : 1/2 * H * B\n\n\nEnter Height : ");
                    double height = input.nextDouble();
                    System.out.print("\nEnter Base : ");
                    double base = input.nextDouble();
                    area = height * base / 2;
                    break;
                case 4:
                    System.out.print("\nFormula : S * S\n\n\nEnter Side Length : ");
                    double sideLengthSq = input.nextDouble();
                    area = sideLengthSq * sideLengthSq;
                    break;
                case 5:
                    System.out.print("\nFormula : H * W\n\n\nEnter Height : ");
                    double heightRec = input.nextDouble();
                    System.out.print("\nEnter Width : ");
                    double widthRec = input.nextDouble();
                    area = heightRec * widthRec;
                    break;
                default:
                    System.out.println("Invalid Choice!\n");

            }
            if (choice >= 1 && choice < 6)
                System.out.println("\nCalculated Area : " + area + " sq. Units");
            System.out.println("\n---------------------------------\n\n");
        }
    }
}
/*
    |---------------------------------------------------|
    |||   https://codeforces.com/profile/codechaser   |||
    |||   https://www.codechef.com/users/codechaser   |||
    |||        https://github.com/code-chaser         |||
    |---------------------------------------------------|
*/