/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_4.problem_4;

import java.util.*;
import java.io.*;

public class Sort {
    static void sort(int[] arr) throws Exception {
        if (arr.length != 10)
            throw new Exception(
                    "\nPassed array must have exactly 10 numbers, given array has " + arr.length + " numbers.\n");
        Arrays.sort(arr);
        System.out.print("\nArray after sorting: ");
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