/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_3.problem_4;

import java.util.*;
import java.io.*;

public class Problem4 {
    
    public static long binToDecimal(String binary, int i) {
        if(i == binary.length()-1) return binary.charAt(i) - '0';
        return ((binary.charAt(i) - '0') << (binary.length()-i-1)) + binToDecimal(binary, i+1);
    }

    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.print("\n\nEnter a Binary Number: ");
        String binary = input.nextLine();
        System.out.println("\nDecimal Representation of " + binary + " is: " + binToDecimal(binary, 0) + "\n");
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