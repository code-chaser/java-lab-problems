/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_4.problem_4;

import java.util.*;
import java.io.*;

public class Divide {

    static void divide(int[] arr, int divisor) throws Exception {
        if (arr.length != 15)
            throw new IllegalArgumentException(
                    "\nPassed array must have exactly 15 numbers, given array has " + arr.length + " numbers.\n");
        else if (divisor == 0)
            throw new ArithmeticException("\nCannot divide by zero.\n");
        for (int i = 0; i < 15; i++)
            arr[i] /= divisor;
        System.out.print("\nArray after divison: ");
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println("\n");
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