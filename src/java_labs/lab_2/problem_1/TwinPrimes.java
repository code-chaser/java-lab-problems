/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_2.problem_1;

import java.util.*;
import java.io.*;

class TwinPrimes {
    private static int[] sieve(int n) {
        int[] a = new int[n + 1];
        for (int i = 0; i <= n; i++)
            a[i] = (((i & 1) == 1) || (i == 2)) ? 1 : 0;
        for (int i = 3; i * i <= n; i += 2)
            if (a[i] == 1)
                for (int j = 3 * i; j <= n; j += i)
                    a[j] = 0;
        return a;
    }

    private static Vector<Integer> twinPrimes(int n) {
        int[] a = TwinPrimes.sieve(n);
        Vector<Integer> twinPrimesArr = new Vector<Integer>(1);
        for (int i = 3; i <= n - 2; i += 2) {
            if (a[i] == 1 && a[i + 2] == 1) {
                if (twinPrimesArr.size() == 0)
                    twinPrimesArr.add(i);
                else if (twinPrimesArr.get(twinPrimesArr.size() - 1) != i)
                    twinPrimesArr.add(i);
                twinPrimesArr.add(i + 2);
            }
        }
        return twinPrimesArr;
    }

    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n---------------------------");
        System.out.println("     P R O B L E M   1");
        System.out.println("---------------------------\n");
        System.out.println("\n\nEnter the number upto which you want to find Twin Primes : \n");
        int n = input.nextInt();
        System.out.println("\n---------------------------\n");
        Vector<Integer> twinPrimesArr = TwinPrimes.twinPrimes(n);
        System.out.println("\nTwin Primes upto " + n + " are : \n");
        for (int i = 0; i < twinPrimesArr.size() - 1; i++)
            if (twinPrimesArr.get(i + 1) == twinPrimesArr.get(i) + 2)
                System.out.println("{ " + twinPrimesArr.get(i) + " , " + twinPrimesArr.get(i + 1) + " }");
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