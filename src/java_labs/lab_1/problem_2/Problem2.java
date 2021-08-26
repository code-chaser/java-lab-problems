/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.util.*;

public class Addition {
    public static void start() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("\n\n| A D D I T I O N |\n\n");
            System.out.println("[01] : Addition of 2 numbers");
            System.out.println("[02] : Addition of 3 numbers");
            System.out.println("[03] : Addition of 4 numbers\n");
            System.out.println("[-1] : Exit\n");
            System.out.println("Enter your choice :\n");
            int choice = input.nextInt();
            if (choice == -1) {
                System.out.println("\nExiting...\n\n");
                return;
            } else if (choice < -1 || choice > 3) {
                System.out.println("\nInvalid Choice\n\n");
            } else {
                double[] numbers = new double[choice + 1];
                System.out.println("\nEnter " + (choice + 1) + " numbers :\n");
                for (int i = 0; i <= choice; i++) {
                    numbers[i] = input.nextDouble();
                }
                System.out.println("\nResult : ");
                switch (choice) {
                    case 1:
                        Addition choice1 = new Addition(numbers[0], numbers[1]);
                        choice1.printValue();
                        break;
                    case 2:
                        Addition choice2 = new Addition(numbers[0], numbers[1], numbers[2]);
                        choice2.printValue();
                        break;
                    case 3:
                        Addition choice3 = new Addition(numbers[0], numbers[1], numbers[2], numbers[3]);
                        choice3.printValue();
                        break;
                }
            }
        } while (true);
    }

    public static void main(String[] args) {
        start();
        return;
    }
}
/*
    |---------------------------------------------------|
    |||   https://codeforces.com/profile/codechaser   |||
    |||   https://www.codechef.com/users/codechaser   |||
    |||        https://github.com/code-chaser         |||
    |---------------------------------------------------|
*/