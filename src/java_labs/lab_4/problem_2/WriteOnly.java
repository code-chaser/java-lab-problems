/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.util.*;

public class WriteOnly {
    private int dummyInt;

    public void setterMethod(int dummyInt) {
        this.dummyInt = dummyInt;
        return;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WriteOnly dummyObject = new WriteOnly();
        System.out.println("\n\n-----------------------------------------");
        System.out.println("\n      W R I T E  O N L Y  C L A S S\n");
        System.out.println("-----------------------------------------\n");
        System.out.print("\nEnter an integer : ");
        int dummyInt = input.nextInt();
        dummyObject.setterMethod(dummyInt);
        System.out.println("\nPrivate field value set successfully!\n");
        System.out.println("\n-----------------------------------------\n\n");
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