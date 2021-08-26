/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.util.*;

public class Mobile {
    private int cost;
    private String camera;
    public String username;

    public Mobile(int cost, String camera, String username) {
        this.cost = cost;
        this.camera = camera;
        this.username = username;
    }

    public void printCost() {
        System.out.print(cost);
        return;
    }

    public void printCamera() {
        System.out.print(camera);
        return;
    }

    public static void main(String[] args) {
        Mobile user1 = new Mobile(1299, "48", "UID-1");
        Mobile user2 = new Mobile(1099, "32", "UID-2");
        Mobile user3 = new Mobile(2099, "64", "UID-3");
        System.out.println("\n\n---------------------------------");
        System.out.println("\n          D E T A I L S\n");
        System.out.println("---------------------------------\n");
        System.out.println("\nUSER 1 : \n");
        System.out.println("\nUsername : " + user1.username);
        System.out.print("\nCamera : ");
        user1.printCamera();
        System.out.print(" Megapixels\n");
        System.out.print("\nCost : ");
        user1.printCost();
        System.out.print(" USD\n\n");
        System.out.println("---------------------------------\n");
        System.out.println("\nUSER 2 : \n");
        System.out.println("\nUsername : " + user2.username);
        System.out.print("\nCamera : ");
        user2.printCamera();
        System.out.print(" Megapixels\n");
        System.out.print("\nCost : ");
        user2.printCost();
        System.out.print(" USD\n\n");
        System.out.println("---------------------------------\n");
        System.out.println("\nUSER 3 : \n");
        System.out.println("\nUsername : " + user3.username);
        System.out.print("\nCamera : ");
        user3.printCamera();
        System.out.print(" Megapixels\n");
        System.out.print("\nCost : ");
        user3.printCost();
        System.out.print(" USD\n\n");
        System.out.println("---------------------------------\n");
        System.out.println("\n---------------------------------\n\n");
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