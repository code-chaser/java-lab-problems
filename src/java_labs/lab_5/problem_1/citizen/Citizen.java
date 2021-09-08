/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_5.problem_1.citizen;

import java.util.*;
import java.io.*;

public class Student {
    private String name = "";
    private int roll, standard;
    public double marksA, marksB, marksC, marksD, marksE;

    public Student(String name, int roll, int standard, double marksA, double marksB, double marksC, double marksD,
            double marksE) {
        this.name = name;
        this.roll = roll;
        this.standard = standard;
        this.marksA = marksA;
        this.marksB = marksB;
        this.marksC = marksC;
        this.marksD = marksD;
        this.marksE = marksE;
    }

    public void updateMarks(double marksA, double marksB, double marksC, double marksD, double marksE) {
        this.marksA = marksA;
        this.marksB = marksB;
        this.marksC = marksC;
        this.marksD = marksD;
        this.marksE = marksE;
        return;
    }

    public void display() {
        System.out.print("\n\nName: " + this.name);
        System.out.print("\nRoll Number: " + this.roll);
        System.out.print("\nStandard: " + this.standard);
        System.out.print("\nMarks in Computer Science: " + this.marksA);
        System.out.print("\nMarks in Mathematics: " + this.marksB);
        System.out.print("\nMarks in Physics: " + this.marksC);
        System.out.print("\nMarks in Chemistry: " + this.marksD);
        System.out.print("\nMarks in English: " + this.marksE + "\n\n");
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