/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_4.problem_5;

import java.util.*;
import java.io.*;
import java_labs.lab_4.problem_5.package1.*;

public class Problem5 {
    public static void start() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n\n---------------------------");
            System.out.println("     P R O B L E M   5");
            System.out.println("---------------------------\n");
            System.out.println("[01] : Importing Package Concept");
            System.out.println("[02] : Fully Qualified Package Name Concept\n");
            System.out.println("[-1] : Exit\n");
            System.out.println("---------------------------\n");
            System.out.println("Enter your choice :\n");
            int size, choice = input.nextInt();
            String temp = input.nextLine();
            System.out.println("\n---------------------------\n");
            if (choice == -1) {
                System.out.println("Exiting...\n");
                System.out.println("---------------------------\n");
                return;
            }
            int[] arr;
            switch (choice) {
                case 1:
                    System.out.println("These message are displayed by importing the packages.");
                    System.out.println(" ");
                    First.display();
                    System.out.println(" ");
                    Second.display();
                    System.out.println(" ");
                    Third.display();
                    System.out.println(" ");
                    System.out.println("\n---------------------------\n");
                    break;
                case 2:
                    System.out.println("These message are displayed using fully qualified package names.");
                    System.out.println(" ");
                    java_labs.lab_4.problem_5.package1.First.display();
                    System.out.println(" ");
                    java_labs.lab_4.problem_5.package1.Second.display();
                    System.out.println(" ");
                    java_labs.lab_4.problem_5.package1.Third.display();
                    System.out.println(" ");
                    System.out.println("\n---------------------------\n");
                    break;
                default:
                    System.out.println("\nInvalid Choice");
                    System.out.print("\n---------------------------\n");
            }
        }
    }

    public static void main(String[] Args) {
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