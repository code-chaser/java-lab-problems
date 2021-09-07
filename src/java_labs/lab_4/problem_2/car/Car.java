/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_4.problem_2.car;

import java.util.*;
import java.io.*;
import java_labs.lab_4.problem_2.vehicle.Vehicle;

public class Car extends Vehicle {
    private String type;
    private int capacity;

    public Car(String engine, String model, String manufacturer, String chassis, String type, int capacity) {
        super(engine, model, manufacturer, chassis);
        this.type = type;
        this.capacity = capacity;
    }

    public void display() {
        super.display();
        System.out.print("\nType: " + this.type);
        System.out.print("\nCapacity: " + this.capacity + "-seater\n\n");
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