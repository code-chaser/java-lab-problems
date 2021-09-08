/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_4.problem_2.vehicle;

import java.util.*;
import java.io.*;

public class Vehicle {
    private String engine, model, manufacturer, chassis;

    public Vehicle(String engine, String model, String manufacturer, String chassis) {
        this.engine = engine;
        this.model = model;
        this.manufacturer = manufacturer;
        this.chassis = chassis;
    }

    public void display() {
        System.out.print("\n\nEngine Number: " + this.engine);
        System.out.print("\nModel: " + this.model);
        System.out.print("\nManufacturer: " + this.manufacturer);
        System.out.print("\nChassis Number: " + this.chassis + "\n\n");
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