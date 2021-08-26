/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_1.problem_6;

import java.util.*;
import java.io.*;

public class Problem6 {
    public static void start() {
        System.out.println("\n\n---------------------------");
        System.out.println("  | VALUES OF VARIABLES |");
        System.out.println("---------------------------\n");
        int z = 8;
        int a = z++ + ++z;
        int b = z-- + --z;
        int c = z++;
        int d = ++z;
        int e = z--;
        int f = --z;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("z = " + z);
        System.out.println("---------------------------\n");
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