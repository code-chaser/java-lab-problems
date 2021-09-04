/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_3.problem_1;

import java.util.*;
import java.io.*;

class Staff extends Student {
    private String name = "", work = "";

    public void takeInput() {
        super.takeInput();
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter Name:");
        this.name = input.nextLine();
        System.out.println("\nEnter Work:");
        this.work = input.nextLine();
        return;
    }

    public void printOutput() {
        super.printOutput();
        System.out.print("\nName: " + this.name);
        System.out.print("\nWork: " + this.work);
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