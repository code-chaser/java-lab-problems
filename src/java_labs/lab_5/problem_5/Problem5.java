
/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_5.problem_5;

import java.util.*;
import java.io.*;

public class Problem5 {
    private static void example() throws Exception {
        try {
            int division = 10 / 0;
            System.out.println("\nRight after printing this line, control is returned to main(); method from example(); method.\n");
            return;
        } catch (Exception e) {
            System.out.println("Exception caught in example(); method.\n");
            throw e;
        } finally {
            System.out.println("Finally block from example(); method got executed.\n");
            throw new IOException("This is the IOException thrown from finally block from example(); method.\n");
        }
    }
    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n---------------------------");
        System.out.println("     P R O B L E M   4");
        System.out.println("---------------------------\n");
        try {
            example();
        } catch (IOException e) {
            System.out.println("IOException caught in main method.\n\nThe exception is:\n" + e);
        } catch (Exception e) {
            System.out.println("Exception caught in main method.\n\nThe exception is:\n" + e);
        }
        System.out.println("---------------------------\n");
    }

    public static void main(String[] Args) {
        start();
        return;
    }
}