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
        minimum = (n1 < n2) ? n1 : n2;
        maximum = (n1 < n2) ? n2 : n1;
        minimum = (n3 < minimum) ? n3 : minimum;
        maximum = (n3 > maximum) ? n3 : maximum;
        minimum = (n4 < minimum) ? n4 : minimum;
        maximum = (n4 > maximum) ? n4 : maximum;
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