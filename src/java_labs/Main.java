/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs;

import java.util.*;
import java.io.*;

public class Main {
    public static void start() {
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("\n\n---------------------------");
            System.out.println("   | J A V A   L A B S |");
            System.out.println("---------------------------\n");
            System.out.println("[01] : LAB 1");
            System.out.println("[02] : LAB 2");
            System.out.println("[03] : LAB 3");
            System.out.println("[04] : LAB 4\n");
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
                    java_labs.lab_1.Lab.start();
                    break;
                case 2:
                    java_labs.lab_2.Lab.start();
                    break;
                case 3:
                    java_labs.lab_3.Lab.start();
                    break;
                case 4:
                    //java_labs.lab_3.Lab.start();
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