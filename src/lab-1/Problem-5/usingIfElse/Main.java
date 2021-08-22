/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter four numbers :\n");
        double n1, n2, n3, n4, minimum, maximum;
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        n4 = input.nextDouble();
        if (n1 < n2) {
            minimum = n1;
            maximum = n2;
        } else {
            maximum = n1;
            minimum = n2;
        }
        if (n3 < minimum)
            minimum = n3;
        if (n3 > maximum)
            maximum = n3;
        if (n4 < minimum)
            minimum = n4;
        if (n4 > maximum)
            maximum = n4;
        System.out.println("\nMinimum = " + minimum);
        System.out.println("Maximum = " + maximum + "\n");
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