/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.util.*;

public class ReadOnly {
    private String dummyString;

    public ReadOnly(String dummyString) {
        this.dummyString = dummyString;
    }

    public String getterMethod() {
        return dummyString;
    }

    public static void main(String[] args) {
        ReadOnly dummyObject = new ReadOnly("LIT2020013");
        System.out.println("\n\n-----------------------------------------");
        System.out.println("\n       R E A D  O N L Y  C L A S S\n");
        System.out.println("-----------------------------------------\n");
        System.out.println("\nThe stored value is : " + dummyObject.getterMethod() + "\n");
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