/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_2.problem_4;

import java.util.*;
import java.io.*;

public class UnmannedVehicle {
    private double X, Y; // strored in miles;

    public UnmannedVehicle() {
    }

    public UnmannedVehicle(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public void setRandomLocation() {
        // sets X and Y to some random value in the range [0,10000);
        this.X = Math.random() * 1000;
        this.Y = Math.random() * 1000;
        return;
    }

    public double getX(int unit) {
        switch (unit) {
            case 2:
                return (X * 1.60934);
            case 3:
                return (X * 1609.34);
            default:
                return X;
        }
    }

    public double getY(int unit) {
        switch (unit) {
            case 2:
                return (Y * 1.60934);
            case 3:
                return (Y * 1609.34);
            default:
                return Y;
        }
    }

    public static void start() {
        UnmannedVehicle dummyUnmannedVehicle = new UnmannedVehicle();
        dummyUnmannedVehicle.setRandomLocation();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n\n---------------------------");
            System.out.println("     L O C A T I O N");
            System.out.println("---------------------------\n");
            System.out.println("[01] : in Miles");
            System.out.println("[02] : in Kilometers");
            System.out.println("[03] : in Meters\n");
            System.out.println("[-1] : Exit\n");
            System.out.println("---------------------------\n\n");
            System.out.println("Enter your choice :");
            int choice = input.nextInt();
            if (choice == -1) {
                System.out.println("\nExiting...\n\n");
                return;
            }
            if (choice < 1 || choice > 3) {
                System.out.println("Invalid Choice!\n");
                System.out.println("---------------------------------\n\n");
                continue;
            }
            double X = dummyUnmannedVehicle.getX(choice), Y = dummyUnmannedVehicle.getY(choice);
            System.out.println("\nX = " + X + "\n" + "Y = " + Y + "\n");
            System.out.println("---------------------------------\n\n");
        }
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