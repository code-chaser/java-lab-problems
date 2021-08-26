/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_1.problem_3;

import java.util.*;
import java.io.*;

class Circle {
    private double area;

    public Circle(double r) {
        area = (3.14) * r * r;
    }

    public void printArea() {
        System.out.print(area + "\n");
        return;
    }

    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n---------------------------");
        System.out.println(" A R E A  O F  C I R C L E");
        System.out.println("---------------------------\n");
        double r;
        System.out.println("Enter radius of the CIRCLE :\n");
        r = input.nextDouble();
        Circle c = new Circle(r);
        System.out.println("\nArea of the CIRCLE : ");
        c.printArea();
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