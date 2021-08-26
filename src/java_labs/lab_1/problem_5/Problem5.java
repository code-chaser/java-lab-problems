/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_1.problem_5;

import java.util.*;
import java.io.*;

public class Problem5 {
    public static void start() {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("\n\n---------------------------");
            System.out.println("   | M A X   &   M I N |");
            System.out.println("---------------------------\n");
            System.out.println("[01] : Using If Else");
            System.out.println("[02] : Using Ternary Operator\n");
            System.out.println("[-1] : Exit\n");
            System.out.println("---------------------------\n");
            System.out.println("Enter your choice :\n");
            int choice = input.nextInt();
            System.out.println("\n---------------------------\n");
            if (choice == -1) {
                System.out.println("\nExiting...\n");
                System.out.println("---------------------------\n");
                return;
            }
            switch (choice) {
                case 1:
                    IfElse.start();
                    break;
                case 2:
                    TernaryOperator.start();
                    break;
                default:
                    System.out.println("\nInvalid Choice");
            }
            System.out.println("\n---------------------------\n");
        }
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