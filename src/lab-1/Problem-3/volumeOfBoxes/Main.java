/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n----------------------------------------------------\n");
        System.out.println("        | V O L U M E | O F | B O X E S |\n");
        System.out.println("----------------------------------------------------\n\n");
        for (int i = 0; i < 3; i++) {
            double h, w, d;
            System.out.println("Enter height, width & depth for BOX " + (i + 1) + " :\n");
            h = input.nextDouble();
            w = input.nextDouble();
            d = input.nextDouble();
            Box b = new Box(h, w, d);
            System.out.println("\nVolume of BOX " + (i + 1) + " : ");
            b.printVolume();
            System.out.println("\n----------------------------------------------------\n\n");
        }
        input.close();
    }
}
/*
    |---------------------------------------------------|
    |||   https://codeforces.com/profile/codechaser   |||
    |||   https://www.codechef.com/users/codechaser   |||
    |||        https://github.com/code-chaser         |||
    |---------------------------------------------------|
*/