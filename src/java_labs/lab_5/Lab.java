/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_4;

import java.util.*;
import java.io.*;

public class Lab {
    public static void start() {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("\n\n---------------------------");
            System.out.println("       | L A B   5 |");
            System.out.println("---------------------------\n");
            System.out.println("[01] : Problem 1");
            System.out.println("[02] : Problem 2");
            System.out.println("[03] : Problem 3");
            System.out.println("[04] : Problem 4");
            System.out.println("[05] : Problem 5\n");
            System.out.println("[-1] : Exit\n");
            System.out.println("---------------------------\n");
            System.out.println("Enter your choice :\n");
            int choice = input.nextInt();
            System.out.println("\n---------------------------\n");
            if (choice == -1) {
                System.out.println("Exiting...\n");
                System.out.println("---------------------------\n");
                return;
            }
            switch (choice) {
                case 1:
                    java_labs.lab_4.problem_1.Problem1.start();
                    break;
                case 2:
                    java_labs.lab_4.problem_2.Problem2.start();
                    break;
                case 3:
                    java_labs.lab_4.problem_3.Problem3.start();
                    break;
                case 4:
                    java_labs.lab_4.problem_4.Problem4.start();
                    break;
                case 5:
                    java_labs.lab_4.problem_5.Problem5.start();
                    break;
                default:
                    System.out.println("\nInvalid Choice");
            }
            System.out.println("\n---------------------------\n");
        }
    }

    public static void main(String[] args){
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