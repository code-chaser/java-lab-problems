/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_4.problem_2;

import java.util.*;
import java.io.*;
import java_labs.lab_4.problem_2.car.Car;
import java_labs.lab_4.problem_2.vehicle.Vehicle;

public class Problem2 {
    public static void start() {
        Car car = new Car("52WVC10338", "2.7L 4X2 MT Fortuner", "Toyota", "MKCL287987463892", "SUV", 7);
        Vehicle vehicle = new Vehicle("83WST28493", "10L Crusher Truck", "Mahindra", "JUYN287987463343");
        while (true) {
            Scanner input = new Scanner(System.in);
            double a, b;
            System.out.println("\n\n---------------------------");
            System.out.println("\n     V E H I C L E S\n");
            System.out.println("---------------------------\n");
            System.out.println("[01] : Print Car Details");
            System.out.println("[02] : Print Vehicle Details\n");
            System.out.println("[-1] : Exit\n");
            System.out.println("---------------------------\n");
            System.out.println("Enter your choice :\n");
            int choice = input.nextInt();
            String temp = input.nextLine();
            System.out.println("\n---------------------------\n");
            if (choice == -1) {
                System.out.println("Exiting...\n");
                System.out.println("---------------------------\n");
                return;
            }
            switch (choice) {
                case 1:
                    car.display();
                    System.out.print("\n---------------------------\n");
                    break;
                case 2:
                    vehicle.display();
                    System.out.print("\n---------------------------\n");
                    break;
                default:
                    System.out.println("\nInvalid Choice");
                    System.out.println("\n---------------------------\n");
                    break;
            }
        }
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