/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_1.problem_5;

import java.util.*;
import java.io.*;

public class TernaryOperator {
    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter four numbers :\n");
        double n1, n2, n3, n4, minimum, maximum;
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        n4 = input.nextDouble();
        minimum = (n1 < n2) ? n1 : n2;
        maximum = (n1 < n2) ? n2 : n1;
        minimum = (n3 < minimum) ? n3 : minimum;
        maximum = (n3 > maximum) ? n3 : maximum;
        minimum = (n4 < minimum) ? n4 : minimum;
        maximum = (n4 > maximum) ? n4 : maximum;
        System.out.println("\nMinimum = " + minimum);
        System.out.println("Maximum = " + maximum + "\n");
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