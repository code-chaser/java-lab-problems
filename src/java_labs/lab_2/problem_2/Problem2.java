/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_2.problem_2;

import java.util.*;
import java.io.*;

public class Problem2 {
    public static void start() {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("\n\n---------------------------");
            System.out.println("     P R O B L E M   2");
            System.out.println("---------------------------\n");
            System.out.println("[01] : Read Only Class");
            System.out.println("[02] : Write Only Class\n");
            System.out.println("[-1] : Exit\n");
            System.out.println("---------------------------\n");
            System.out.println("Enter your choice :\n");
            int choice = input.nextInt();
            System.out.println("\n---------------------------\n");
            if (choice == -1) {
                System.out.println("Exiting...\n");
                System.out.println("---------------------------\n");
                return;
            } else if (choice < -1 || choice > 2) {
                System.out.println("\nInvalid Choice");
            }
            switch (choice) {
                case 1:
                    ReadOnly.start();
                    break;
                case 2:
                    WriteOnly.start();
                    break;
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