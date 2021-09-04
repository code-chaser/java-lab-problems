/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_3.problem_5;

import java.util.*;
import java.io.*;

public class Problem5 {
    public static void start() {
        int students = 0, teachers = 0, staff = 0;
        Vector<Student> studentsList = new Vector<Student>(1);
        Vector<Teacher> teachersList = new Vector<Teacher>(1);
        Vector<Staff> staffList = new Vector<Staff>(1);
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n\n---------------------------");
            System.out.println("        S C H O O L");
            System.out.println("---------------------------\n");
            System.out.println("[01] : Add a new student");
            System.out.println("[02] : Print all students' details\n");
            System.out.println("[03] : Add a new teacher");
            System.out.println("[04] : Print all teachers' details\n");
            System.out.println("[05] : Add a new staff");
            System.out.println("[06] : Print all staff' details\n");
            System.out.println("[-1] : Exit\n");
            System.out.println("---------------------------\n");
            System.out.println("Enter your choice:");
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
                    Student S = new Student();
                    S.takeInput();
                    studentsList.add(S);
                    students++;
                    System.out.println("\n---------------------------\n");
                    break;
                case 2:
                    System.out.println("\nDetails: \n");
                    for (int i = 0; i < students; i++) {
                        studentsList.get(i).printOutput();
                        System.out.println("\n");
                    }
                    System.out.println("---------------------------\n");
                    break;
                case 3:
                    Teacher T = new Teacher();
                    T.takeInput();
                    teachersList.add(T);
                    teachers++;
                    System.out.println("\n---------------------------\n");
                    break;
                case 4:
                    System.out.println("\nDetails: \n");
                    for (int i = 0; i < teachers; i++) {
                        teachersList.get(i).printOutput();
                        System.out.println("\n");
                    }
                    System.out.println("---------------------------\n");
                    break;
                case 5:
                    Staff X = new Staff();
                    X.takeInput();
                    staffList.add(X);
                    staff++;
                    System.out.println("\n---------------------------\n");
                    break;
                case 6:
                    System.out.println("\nDetails: \n");
                    for (int i = 0; i < staff; i++) {
                        staffList.get(i).printOutput();
                        System.out.println("\n");
                    }
                    System.out.println("---------------------------\n");
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    System.out.print("\n---------------------------\n");
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