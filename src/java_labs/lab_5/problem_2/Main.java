/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_5.problem_2;

import java.util.*;
import java.io.*;
import java_labs.lab_5.problem_2.package1.*;

public class Main {
    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n---------------------------");
        System.out.println("     P R O B L E M   2");
        System.out.println("---------------------------\n");
        System.out.println("Enter the size of the list :\n");
        int size = input.nextInt();
        System.out.println("\nEnter the elements of the list :\n");
        Vector<Integer> list = new Vector<Integer>(size);
        for(int i = 0; i < size; i++) {
            int inp = input.nextInt();
            list.add(inp);
        }
        System.out.println("\n---------------------------\n");
        double ans = Sum.sum(list);
        int k;
        try {
            k = Minimum.minimum(list);
            if(k == 0) throw new Exception("Cannot divide by zero. Minimum element of the list cannot be zero.\n");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\n---------------------------\n");
            return;
        }
        ans /= k;
        System.out.println("The required answer is : " + ans);
        System.out.println("\n---------------------------\n");
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