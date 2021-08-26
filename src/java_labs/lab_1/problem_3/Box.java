/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_1.problem_3;

import java.util.*;
import java.io.*;

class Box {
    private double volume;

    public Box(double h, double w, double d) {
        volume = h * w * d;
    }

    public void printVolume() {
        System.out.print(volume + "\n");
        return;
    }

    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n---------------------------");
        System.out.println("V O L U M E  O F  B O X E S");
        System.out.println("---------------------------\n");
        for (int i = 0; i < 3; i++) {
            double h, w, d;
            System.out.println("Enter height, width & depth for BOX " + (i + 1) + " :\n");
            h = input.nextDouble();
            w = input.nextDouble();
            d = input.nextDouble();
            Box b = new Box(h, w, d);
            System.out.println("\nVolume of BOX " + (i + 1) + " : ");
            b.printVolume();
            System.out.println("\n---------------------------\n");
        }
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