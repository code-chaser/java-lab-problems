/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_2.problem_2;

import java.util.*;
import java.io.*;

class WriteOnly {
    private int dummyInt;

    public void setterMethod(int dummyInt) {
        this.dummyInt = dummyInt;
        return;
    }

    public static void start() {
        Scanner input = new Scanner(System.in);
        WriteOnly dummyObject = new WriteOnly();
        System.out.println("\n\n---------------------------");
        System.out.println("    WRITE - ONLY  CLASS\n");
        System.out.println("---------------------------\n");
        System.out.print("Enter an integer : ");
        int dummyInt = input.nextInt();
        dummyObject.setterMethod(dummyInt);
        System.out.println("\nPrivate field value set successfully!");
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