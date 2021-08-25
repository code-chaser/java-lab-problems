/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.util.*;

class Student {
    private String name = "", phone = "";
    private int roll = 0;

    public void takeInput() {
        Scanner input = new Scanner(System.in);
        String temp;
        System.out.println("\nEnter Name: ");
        this.name = input.nextLine();
        System.out.println("\nEnter Phone Number: ");
        this.phone = input.nextLine();
        System.out.println("\nEnter Roll Number: ");
        this.roll = input.nextInt();
        temp = input.nextLine();
        return;
    }

    public void printOutput() {
        System.out.print("\nName: " + this.name);
        System.out.print("\nPhone Number: " + this.phone);
        System.out.print("\nRoll Number: " + this.roll);
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