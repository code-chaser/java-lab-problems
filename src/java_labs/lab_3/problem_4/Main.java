/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.util.*;

public class Main {
    
    public static long binToDecimal(String binary, int i) {
        if(i == binary.length()-1) return binary.charAt(i) - '0';
        return ((binary.charAt(i) - '0') << (binary.length()-i-1)) + binToDecimal(binary, i+1);
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\n\nEnter a Binary Number: ");
        String binary = input.nextLine();
        System.out.println("\nDecimal Representation of " + binary + " is: " + binToDecimal(binary, 0) + "\n");
    }
}
/*
    |---------------------------------------------------|
    |||   https://codeforces.com/profile/codechaser   |||
    |||   https://www.codechef.com/users/codechaser   |||
    |||        https://github.com/code-chaser         |||
    |---------------------------------------------------|
*/