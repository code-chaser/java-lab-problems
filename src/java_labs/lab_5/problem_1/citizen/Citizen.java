/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_5.problem_1.citizen;

import java.util.*;
import java.io.*;

public abstract class Citizen {
    protected String name, aadharNum, phone;
    protected int age;

    public Citizen(String name, String aadharNum, String phone, int age) {
        this.name = name;
        this.aadharNum = aadharNum;
        this.phone = phone;
        this.age = age;
    }

    public abstract void verifyAge() throws Exception;
}
/*
    |---------------------------------------------------|
    |||   https://codeforces.com/profile/codechaser   |||
    |||   https://www.codechef.com/users/codechaser   |||
    |||        https://github.com/code-chaser         |||
    |---------------------------------------------------|
*/