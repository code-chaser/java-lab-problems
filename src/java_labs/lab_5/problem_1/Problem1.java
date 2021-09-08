/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_5.problem_1;

import java.util.*;
import java.io.*;

public class Problem1 {
    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n---------------------------");
        System.out.println("   V A C C I N A T I O N");
        System.out.println("---------------------------\n");
        System.out.println("Enter citizen's details :\n");
        System.out.println("Name :\n");
        String name = input.nextLine();
        System.out.println("\nAadhar Number :\n");
        String aadharNum = input.nextLine();
        System.out.println("\nPhone :\n");
        String phone = input.nextLine();
        System.out.println("\nAge :\n");
        int age = input.nextInt();
        String temp = input.nextLine();
        Vaccine v = new Vaccine(name,aadharNum,phone,age);
        try {
            v.verifyAge();
        } catch (Exception e) {
            System.out.print("\n" + e);
        }
        System.out.println("\n---------------------------\n");
        return;
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