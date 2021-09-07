/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_2.problem_8;

import java.util.*;
import java.io.*;

public class Fibonacci {
    private static Vector<Integer> fibonacciNumbers(int n) {
        Vector<Integer> fibonacciNumbersArr = new Vector<Integer>(2);
        fibonacciNumbersArr.add(0);
        fibonacciNumbersArr.add(1);
        for (int i = 2; fibonacciNumbersArr.get(i - 1) + fibonacciNumbersArr.get(i - 2) <= n; i++)
            fibonacciNumbersArr.add(fibonacciNumbersArr.get(i - 1) + fibonacciNumbersArr.get(i - 2));
        return fibonacciNumbersArr;
    }

    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n---------------------------");
        System.out.println("     P R O B L E M   8");
        System.out.println("---------------------------\n");
        System.out.println("\n\nEnter the number upto which you want to print Fibonacci Numbers : \n");
        int n = input.nextInt();
        System.out.println("\n---------------------------\n");
        Vector<Integer> fibonacciNumbersArr = Fibonacci.fibonacciNumbers(n);
        System.out.println("\nFibonacci Numbers upto " + n + " are : \n" + ((n == 0) ? "[0]" : fibonacciNumbersArr));
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