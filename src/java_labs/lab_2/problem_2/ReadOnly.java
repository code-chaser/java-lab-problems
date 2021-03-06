/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_2.problem_2;

import java.util.*;
import java.io.*;

class ReadOnly {
    private String dummyString;

    public ReadOnly(String dummyString) {
        this.dummyString = dummyString;
    }

    public String getterMethod() {
        return dummyString;
    }

    public static void start() {
        ReadOnly dummyObject = new ReadOnly("LIT2020013");
        System.out.println("\n\n---------------------------");
        System.out.println("     READ - ONLY CLASS\n");
        System.out.println("---------------------------\n");
        System.out.println("The stored value is : " + dummyObject.getterMethod());
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