/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_1.problem_4;

import java.util.*;
import java.io.*;

public class Problem4 {
    public static void start() {
        System.out.println("\n\n---------------------------");
        System.out.println(" | VALUES OF EXPRESSIONS |");
        System.out.println("---------------------------\n");
        System.out.println("10 & 50  = " + (10 & 50));
        System.out.println("30 || 40 = " + ((30 != 0) && (40 != 0)));
        System.out.println("~50      = " + (~50));
        System.out.println("60 >> 3  = " + (60 >> 3));
        System.out.println("70 << 8  = " + (70 << 8));
        System.out.println("55 >>> 2 = " + (55 >>> 2) + "\n");
        System.out.println("---------------------------\n");
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