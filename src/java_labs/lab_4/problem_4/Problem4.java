
/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_4.problem_4;

import java.util.*;
import java.io.*;

public class Problem4 {
    public static void start() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n\n---------------------------");
            System.out.println("     P R O B L E M   4");
            System.out.println("---------------------------\n");
            System.out.println("[01] : Sort an array");
            System.out.println("[02] : Divide an array by an integer\n");
            System.out.println("[-1] : Exit\n");
            System.out.println("---------------------------\n");
            System.out.println("Enter your choice :\n");
            int size, choice = input.nextInt();
            String temp = input.nextLine();
            System.out.println("\n---------------------------\n");
            if (choice == -1) {
                System.out.println("\nExiting...\n");
                System.out.println("---------------------------\n");
                return;
            }
            int[] arr;
            switch (choice) {
                case 1:
                    System.out.println("\nEnter size of the array you want to input:\n");
                    size = input.nextInt();
                    temp = input.nextLine();
                    arr = new int[size];
                    System.out.println("\nNow enter the numbers:\n");
                    for (int i = 0; i < size; i++)
                        arr[i] = input.nextInt();
                    try {
                        Sort.sort(arr);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    System.out.println("\n---------------------------\n");
                    break;
                case 2:
                    System.out.println("\nEnter size of the array you want to input:\n");
                    size = input.nextInt();
                    temp = input.nextLine();
                    arr = new int[size];
                    System.out.println("\nNow enter the numbers:\n");
                    for (int i = 0; i < size; i++)
                        arr[i] = input.nextInt();
                    temp = input.nextLine();
                    System.out.println("\nEnter an integer to divide the array:\n");
                    int divisor = input.nextInt();
                    temp = input.nextLine();
                    try {
                        Divide.divide(arr, divisor);
                    } catch (Exception e) {
                        System.out.println(e);
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