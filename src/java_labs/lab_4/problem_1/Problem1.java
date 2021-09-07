/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_4.problem_1;

import java.util.*;
import java.io.*;
import java_labs.lab_4.problem_1.MCA.Student;

public class Problem1 {
    public static void start() {
        int students = 0;
        Vector<Student> studentsList = new Vector<Student>(1);
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n\n---------------------------");
            System.out.println("        S C H O O L");
            System.out.println("---------------------------\n");
            System.out.println("[01] : Add a new student");
            System.out.println("[02] : Update a students' marks");
            System.out.println("[03] : Print a student's details");
            System.out.println("[04] : Print all students' details\n");
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
            String name;
            int roll, standard;
            double totalMarks, percentage, marksA, marksB, marksC, marksD, marksE;
            switch (choice) {
                case 1:
                    System.out.println("\nEnter Student's Name: ");
                    name = input.nextLine();
                    System.out.println("\nEnter Student's Standard: ");
                    standard = input.nextInt();
                    temp = input.nextLine();
                    System.out.println("\nNOTE: Enter all marks out of 100");
                    System.out.println("\nEnter Student's marks in Computer Science: ");
                    marksA = input.nextDouble();
                    temp = input.nextLine();
                    System.out.println("\nEnter Student's marks in Mathematics: ");
                    marksB = input.nextDouble();
                    temp = input.nextLine();
                    System.out.println("\nEnter Student's marks in Physics: ");
                    marksC = input.nextDouble();
                    temp = input.nextLine();
                    System.out.println("\nEnter Student's marks in Chemistry: ");
                    marksD = input.nextDouble();
                    temp = input.nextLine();
                    System.out.println("\nEnter Student's marks in English: ");
                    marksE = input.nextDouble();
                    temp = input.nextLine();
                    students++;
                    Student S = new Student(name, students, standard, marksA, marksB, marksC, marksD, marksE);
                    studentsList.add(S);
                    System.out.println("\n" + name + " successfully added, their Roll Number is " + students + ".");
                    System.out.println("\n---------------------------\n");
                    break;
                case 2:
                    System.out.println("\nEnter Student's Roll Number: ");
                    roll = input.nextInt();
                    temp = input.nextLine();
                    if (roll < 1 || roll > students) {
                        System.out.println("\nInvalid Roll Number!");
                        System.out.println("\n---------------------------\n");
                        break;
                    }
                    System.out.println("\nNOTE: Enter all marks out of 100");
                    System.out.println("\nEnter Student's marks in Computer Science: ");
                    marksA = input.nextDouble();
                    temp = input.nextLine();
                    System.out.println("\nEnter Student's marks in Mathematics: ");
                    marksB = input.nextDouble();
                    temp = input.nextLine();
                    System.out.println("\nEnter Student's marks in Physics: ");
                    marksC = input.nextDouble();
                    temp = input.nextLine();
                    System.out.println("\nEnter Student's marks in Chemistry: ");
                    marksD = input.nextDouble();
                    temp = input.nextLine();
                    System.out.println("\nEnter Student's marks in English: ");
                    marksE = input.nextDouble();
                    temp = input.nextLine();
                    studentsList.get(roll - 1).updateMarks(marksA, marksB, marksC, marksD, marksE);
                    System.out.println("\nMarks updated successfully!");
                    System.out.println("\n---------------------------\n");
                    break;
                case 3:
                    System.out.println("\nEnter Student's Roll Number: ");
                    roll = input.nextInt();
                    temp = input.nextLine();
                    if (roll < 1 || roll > students) {
                        System.out.println("\nInvalid Roll Number!");
                        System.out.println("\n---------------------------\n");
                        break;
                    }
                    System.out.println("\nDetails: \n");
                    studentsList.get(roll - 1).display();
                    totalMarks = studentsList.get(roll - 1).marksA + studentsList.get(roll - 1).marksB
                            + studentsList.get(roll - 1).marksC + studentsList.get(roll - 1).marksD
                            + studentsList.get(roll - 1).marksE;
                    percentage = totalMarks / 5;
                    System.out.print("\nTotal Marks: " + totalMarks);
                    System.out.print("\nPercentage: " + percentage + "\n");
                    System.out.println("\n---------------------------\n");
                    break;
                case 4:
                    System.out.println("\nDetails: \n");
                    for (int i = 0; i < students; i++) {
                        studentsList.get(i).display();
                        totalMarks = studentsList.get(i).marksA + studentsList.get(i).marksB
                                + studentsList.get(i).marksC + studentsList.get(i).marksD + studentsList.get(i).marksE;
                        percentage = totalMarks / 5;
                        System.out.print("\nTotal Marks: " + totalMarks);
                        System.out.print("\nPercentage: " + percentage + "\n");
                    }
                    System.out.println("\n--------------------------\n");
                    break;
                default:
                    System.out.println("\nInvalid Choice");
                    System.out.println("\n---------------------------\n");
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