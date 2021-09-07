/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_2.problem_6;

import java.util.*;
import java.io.*;

public class PentagonalNumbers {
    private static int pentagonalNumber(int n) {
        return 3 * n * n / 2 - n / 2;
    }

    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n---------------------------");
        System.out.println("     P R O B L E M   6");
        System.out.println("---------------------------\n");
        System.out.println("\n\nEnter the number of Pentagonal Numbers you want to print : \n");
        int n = input.nextInt();
        System.out.println("\n---------------------------\n");
        System.out.println("\n");
        for (int i = 0; i < n; i++)
            System.out.print(pentagonalNumber(i + 1) + (i != n - 1 ? " , " : ""));
        System.out.println("\n");
        System.out.println("\n---------------------------\n");
        return;
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