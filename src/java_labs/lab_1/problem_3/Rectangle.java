/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.util.*;

public class Rectangle {
    private double area;

    public Rectangle(double h, double w) {
        area = h * w;
    }

    public void printArea() {
        System.out.print(area + "\n");
        return;
    }

    public static void start() {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n----------------------------------------------------\n");
        System.out.println("       | A R E A | O F | R E C T A N G L E |        \n");
        System.out.println("----------------------------------------------------\n\n");
        double h, w;
        System.out.println("Enter height & width of the RECTANGLE :\n");
        h = input.nextDouble();
        w = input.nextDouble();
        Rectangle b = new Rectangle(h, w);
        System.out.println("\nArea of the RECTANGLE : ");
        b.printArea();
        System.out.println("\n----------------------------------------------------\n\n");
        return;
    }

    public static void main(String[] args) {
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