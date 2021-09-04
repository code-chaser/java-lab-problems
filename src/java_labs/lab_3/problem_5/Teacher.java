/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_3.problem_5;

import java.util.*;
import java.io.*;

class Teacher extends Student {
    private String subject = "", field = "";

    static class Science {
        private static int numberOfStudents = 0;

        public static void takeInput() {
            Scanner input = new Scanner(System.in);
            String temp;
            System.out.println("\nEnter Number of Science Students:");
            numberOfStudents = input.nextInt();
            temp = input.nextLine();
            return;
        }

        public static void printOutput() {
            System.out.print("\nNumber of Science Students: " + numberOfStudents);
            return;
        }
    }

    static class Arts {
        private static int numberOfStudents = 0;

        public static void takeInput() {
            Scanner input = new Scanner(System.in);
            String temp;
            System.out.println("\nEnter Number of Arts Students:");
            numberOfStudents = input.nextInt();
            temp = input.nextLine();
            return;
        }

        public static void printOutput() {
            System.out.print("\nNumber of Arts Students: " + numberOfStudents);
            return;
        }
    }

    static class Commerce {
        private static int numberOfStudents = 0;

        public static void takeInput() {
            Scanner input = new Scanner(System.in);
            String temp;
            System.out.println("\nEnter Number of Commerce Students:");
            numberOfStudents = input.nextInt();
            temp = input.nextLine();
            return;
        }

        public static void printOutput() {
            System.out.print("\nNumber of Commerce Students: " + numberOfStudents);
            return;
        }
    }

    public void takeInput() {
        super.takeInput();
        Scanner input = new Scanner(System.in);
        String temp;
        System.out.println("\nEnter Subject:");
        this.subject = input.nextLine();
        System.out.println("\nEnter Field:");
        this.field = input.nextLine();
        Science.takeInput();
        Arts.takeInput();
        Commerce.takeInput();
        return;
    }

    public void printOutput() {
        super.printOutput();
        System.out.print("\nSubject: " + this.subject);
        System.out.print("\nField: " + this.field);
        Science.printOutput();
        Arts.printOutput();
        Commerce.printOutput();
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