/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_5.problem_4;

import java.util.*;
import java.io.*;

public class Problem4 {
    private static void first() throws ArithmeticException {
        try {
            second();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in first method.\n");
            throw e;
        }
    }

    private static void second() throws ArithmeticException {
        try {
            third();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in second method.\n");
            throw e;
        }
    }

    private static void third() throws ArithmeticException {
        try {
            fourth();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in third method.\n");
            throw e;
        }
    }

    private static void fourth() throws ArithmeticException {
        throw new ArithmeticException("This is the ArithmeticException thrown from fourth method.\n");
    }

    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n---------------------------");
        System.out.println("     P R O B L E M   4");
        System.out.println("---------------------------\n");
        try {
            first();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in main method.\n\nThe exception is:\n" + e);
        }
        System.out.println("---------------------------\n");
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