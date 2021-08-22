/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number = 0;
        do {
            System.out.println("\n\n---------------------------");
            System.out.println("  | C A L C U L A T O R |");
            System.out.println("---------------------------\n");
            System.out.println("Current Number : " + number + "\n");
            System.out.println("---------------------------\n");
            System.out.println("[01] : ( + )  Add");
            System.out.println("[02] : ( - )  Subtract");
            System.out.println("[03] : ( x )  Multiply");
            System.out.println("[04] : ( / )  Divide");
            System.out.println("[05] : ( % )  Modulo");
            System.out.println("[06] : ( && ) Logical AND");
            System.out.println("[07] : ( || ) Logical OR");
            System.out.println("[08] : ( ! )  Logical NOT");
            System.out.println("[09] : ( C )  Clear\n");
            System.out.println("[-1] : Exit\n");
            System.out.println("---------------------------\n");
            System.out.println("Enter your choice :\n");
            int choice = input.nextInt();
            if (choice == -1) {
                input.close();
                System.out.println("\nExiting...\n\n");
                return;
            } else if (choice == 8) {
                number = (number != 0) ? 0 : 1;
            } else if (choice == 9) {
                number = 0;
            } else if (choice < -1 || choice > 9) {
                System.out.println("\nInvalid Choice\n\n");
            } else {
                System.out.println("\nEnter a number :\n");
                double operand = input.nextDouble();
                switch (choice) {
                    case 1:
                        number += operand;
                        break;
                    case 2:
                        number -= operand;
                        break;
                    case 3:
                        number *= operand;
                        break;
                    case 4:
                        number /= operand;
                        break;
                    case 5:
                        long a = (long) number, b = (long) operand;
                        a %= b;
                        number = a;
                        break;
                    case 6:
                        number = (number != 0) && (operand != 0) ? 1 : 0;
                        break;
                    case 7:
                        number = (number != 0) || (operand != 0) ? 1 : 0;
                        break;
                }
            }
        } while (true);
    }
}
/*
    |---------------------------------------------------|
    |||   https://codeforces.com/profile/codechaser   |||
    |||   https://www.codechef.com/users/codechaser   |||
    |||        https://github.com/code-chaser         |||
    |---------------------------------------------------|
*/