/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_4.problem_3;

import java.util.*;
import java.io.*;
import java_labs.lab_4.problem_3.example.*;

public class Problem3 {
    public static void start() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n\n---------------------------");
            System.out.println("        P R O B L E M   3");
            System.out.println("---------------------------\n");
            System.out.println("[01] : PublicClassA Content");
            System.out.println("[02] : PublicClassB Content");
            System.out.println("[03] : PublicClassC Content\n");
            System.out.println("[-1] : Exit\n");
            System.out.println("---------------------------\n");
            System.out.println("Enter your choice :\n");
            int choice = input.nextInt();
            String temp = input.nextLine();
            System.out.println("\n---------------------------\n");
            if (choice == -1) {
                System.out.println("Exiting...\n");
                System.out.println("---------------------------\n");
                return;
            }
            switch (choice) {
                case 1:
                    PublicClassA A = new PublicClassA();
                    A.method1();
                    A.method2();
                    System.out.println("\n---------------------------\n");
                    break;
                case 2:
                    PublicClassB B = new PublicClassB();
                    B.method1();
                    B.method2();
                    System.out.println("\n---------------------------\n");
                    break;
                case 3:
                    PublicClassC C = new PublicClassC();
                    C.method1();
                    C.method2();
                    PublicClassC.Class1 C1 = C.new Class1();
                    C1.method();
                    PublicClassC.Class2 C2 = C.new Class2();
                    C2.method();
                    PublicClassC.Class3 C3 = C.new Class3();
                    C3.method();
                    System.out.println("\n---------------------------\n");
                    break;
                default:
                    System.out.println("\nInvalid Choice");
                    System.out.println("\n---------------------------\n");
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