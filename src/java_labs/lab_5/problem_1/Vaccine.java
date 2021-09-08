/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_5.problem_1;

import java.util.*;
import java.io.*;
import java_labs.lab_5.problem_1.citizen.Citizen;

public class Vaccine extends Citizen {
    public Vaccine(String name, String aadharNum, String phone, int age) {
        super(name, aadharNum, phone, age);
    }

    public void verifyAge() throws Exception {
        if (this.age < 18) {
            throw new Exception("Citizen must be at least 18 years old to be elligible for vaccination.\n");
        } else {
            System.out.println("\n" + name + " is elligible for vaccination!");
        }
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