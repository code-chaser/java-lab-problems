/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_1.problem_3;

import java.util.*;
import java.io.*;

public class Problem3 {
    public static void start() {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("\n\n---------------------------");
            System.out.println(" A R E A   &   V O L U M E");
            System.out.println("---------------------------\n");
            System.out.println("[01] : Area of Circle");
            System.out.println("[02] : Area of Rectangle");
            System.out.println("[03] : Volume of Box\n");
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
                    Circle.start();
                    break;
                case 2:
                    Rectangle.start();
                    break;
                case 3:
                    Box.start();
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