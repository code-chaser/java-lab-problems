/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_2.problem_3;

import java.util.*;
import java.io.*;

public class Mobile {
    private int cost;
    private String camera;
    public String username;

    public Mobile(int cost, String camera, String username) {
        this.cost = cost;
        this.camera = camera;
        this.username = username;
    }

    public void printCost() {
        System.out.print(cost);
        return;
    }

    public void printCamera() {
        System.out.print(camera);
        return;
    }

    public static void start() {
        Mobile user1 = new Mobile(1299, "48", "UID-1");
        Mobile user2 = new Mobile(1099, "32", "UID-2");
        Mobile user3 = new Mobile(2099, "64", "UID-3");
        System.out.println("\n\n---------------------------");
        System.out.println("       D E T A I L S");
        System.out.println("---------------------------\n");
        System.out.println("USER 1 : \n");
        System.out.println("Username : " + user1.username);
        System.out.print("Camera : ");
        user1.printCamera();
        System.out.print(" Megapixels\n");
        System.out.print("Cost : ");
        user1.printCost();
        System.out.print(" USD\n\n");
        System.out.println("---------------------------\n");
        System.out.println("USER 2 : \n");
        System.out.println("Username : " + user2.username);
        System.out.print("Camera : ");
        user2.printCamera();
        System.out.print(" Megapixels\n");
        System.out.print("Cost : ");
        user2.printCost();
        System.out.print(" USD\n\n");
        System.out.println("---------------------------\n");
        System.out.println("USER 3 : \n");
        System.out.println("Username : " + user3.username);
        System.out.print("Camera : ");
        user3.printCamera();
        System.out.print(" Megapixels\n");
        System.out.print("Cost : ");
        user3.printCost();
        System.out.print(" USD\n\n");
        System.out.println("---------------------------\n");
        System.out.println("---------------------------\n\n");
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