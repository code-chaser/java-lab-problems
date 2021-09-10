/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_5.problem_3;

import java.util.*;
import java.io.*;

public class Problem3 {
    private static void method1(int i) {
        if (i == 1) {
            int x = i / (i - i); // throws ArithmeticException;
        }
        else {
            Vector<Integer> v = new Vector<Integer>(0);
            int x = v.get(27); // throws ArrayIndexOutOfBoundsException;
        }
        return;
    }

    private static void method2(int i) throws ArithmeticException, ArrayIndexOutOfBoundsException, FileNotFoundException {
        if (i == 1)
            throw new ArithmeticException("Checked ArithmeticException Thrown from method 2\n");
        if (i == 2)
            throw new ArrayIndexOutOfBoundsException("Checked ArrayIndexOutOfBoundsException Thrown from method 2\n");
        else
            throw new FileNotFoundException("Checked FileNotFoundException Thrown from method 2\n");
    }

    public static void start() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n\n---------------------------");
            System.out.println("        P R O B L E M   3");
            System.out.println("---------------------------\n");
            System.out.println("[01] : Throw Unchecked Exceptions");
            System.out.println("[02] : Throw Checked Exceptions\n");
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
                    try {
                        method1(1);
                    } catch (ArithmeticException e) {
                        System.out.println("Caught unchecked ArithmeticException from method1();");
                        System.out.println(e + "\n");
                    } finally {
                        System.out.println("'finally block 1' reached!\n");
                    }
                    try {
                        method1(2);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Caught unchecked ArrayIndexOutOfBoundsException from method1();");
                        System.out.println(e + "\n");
                    } finally {
                        System.out.println("'finally block 2' reached!\n");
                    }
                    System.out.println("\n---------------------------\n");
                    break;
                case 2:
                    try {
                        method2(1);
                    } catch (Exception e) {
                        System.out.println("Caught checked ArithmeticException from method2();");
                        System.out.println(e + "\n");
                    } finally {
                        System.out.println("'finally block 1' reached!\n");
                    }
                    try {
                        method2(2);
                    } catch (Exception e) {
                        System.out.println("Caught checked ArrayIndexOutOfBoundsException from method2();");
                        System.out.println(e + "\n");
                    } finally {
                        System.out.println("'finally block 2' reached!\n");
                    }
                    try {
                        method2(3);
                    } catch (Exception e) {
                        System.out.println("Caught checked FileNotFoundException from method2();");
                        System.out.println(e + "\n");
                    } finally {
                        System.out.println("'finally block 3' reached!\n");
                    }
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