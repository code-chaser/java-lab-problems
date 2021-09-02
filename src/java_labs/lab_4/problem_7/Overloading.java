
/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
import java.util.*;

public class Overloading {
    private String stringVariable;
    private int intVariable;

    public Overloading() {
        System.out.println("Constructor accepting 0 arguments called;\n");
        this.stringVariable = "";
        this.intVariable = 0;
        System.out.println("\nstringVariable value initialized with : ''" + stringVariable);
        System.out.println("intVariable value initialized with : " + intVariable + "\n");
    }

    public Overloading(String stringVariable) {
        System.out.println("Constructor accepting argument of type String called;\n");
        this.stringVariable = stringVariable;
        this.intVariable = 0;
        System.out.println("\nstringVariable value initialized with : " + stringVariable);
        System.out.println("intVariable value initialized with : " + intVariable + "\n");
    }

    public Overloading(int intVariable) {
        System.out.println("Constructor accepting argument of type Integer called;\n");
        this.intVariable = intVariable;
        this.stringVariable = "";
        System.out.println("\nstringVariable value initialized with : ''" + stringVariable);
        System.out.println("intVariable value initialized with : " + intVariable + "\n");
    }

    public Overloading(String stringVariable, int intVariable) {
        System.out.println("Constructor accepting two arguments of types String & Integer called;\n");
        this.intVariable = intVariable;
        this.stringVariable = stringVariable;
        System.out.println("\nstringVariable value initialized with : " + stringVariable);
        System.out.println("intVariable value initialized with : " + intVariable + "\n");
    }

    public void add(String s) {
        System.out.println("add(); Method accepting argument of type String called;\n");
        stringVariable += s;
        System.out.println("\nstringVariable value updated to : " + stringVariable + "\n");
    }

    public void add(int a) {
        System.out.println("add(); Method accepting argument of type Integer called;\n");
        intVariable += a;
        System.out.println("\nintVariable value updated to : " + intVariable + "\n");
    }

    public void add(String s, int a) {
        System.out.println("add(); Method accepting two arguments of types String & Integer called;\n");
        intVariable += a;
        stringVariable += s;
        System.out.println("\nstringVariable value updated to : " + stringVariable);
        System.out.println("intVariable value updated to : " + intVariable + "\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n-------------------------------------------------\n");
            System.out.println("             O V E R L O A D I N G\n");
            System.out.println("-------------------------------------------------\n");
            System.out.println("[01] : Costructor Overloading");
            System.out.println("[02] : Method Overloading\n");
            System.out.println("[-1] : Exit\n");
            System.out.println("-------------------------------------------------\n");
            int choice = input.nextInt();
            if (choice == -1) {
                System.out.println("\nExiting...\n");
                break;
            }
            String s;
            int a;
            System.out.println("\n-------------------------------------------------\n");
            System.out.println("Creating a dummy object to work upon;\n");
            System.out.println("-------------------------------------------------\n");
            Overloading dummyObj = new Overloading();
            System.out.println("-------------------------------------------------\n");
            if (choice == 1) {
                System.out.print("Enter a String : ");
                s = input.nextLine();
                s = input.nextLine();
                System.out.println("\n-------------------------------------------------\n");
                dummyObj = new Overloading(s);
                System.out.println("-------------------------------------------------\n");
                System.out.print("Enter an Integer : ");
                a = input.nextInt();
                System.out.println("\n-------------------------------------------------\n");
                dummyObj = new Overloading(a);
                System.out.println("-------------------------------------------------\n");
                System.out.print("Enter a String and an Integer :\nString : ");
                s = input.nextLine();
                s = input.nextLine();
                System.out.print("Integer : ");
                a = input.nextInt();
                System.out.println("\n-------------------------------------------------\n");
                dummyObj = new Overloading(s, a);
                System.out.println("-------------------------------------------------\n");
            } else if (choice == 2) {
                System.out.print("Enter a String to be concatenated to stringVariable : ");
                s = input.nextLine();
                s = input.nextLine();
                System.out.println("\n-------------------------------------------------\n");
                dummyObj.add(s);
                System.out.println("-------------------------------------------------\n");
                System.out.print("Enter an Integer to be added to intVariable : ");
                a = input.nextInt();
                System.out.println("\n-------------------------------------------------\n");
                dummyObj.add(a);
                System.out.println("-------------------------------------------------\n");
                System.out.print("Enter a String and an Integer :\nString : ");
                s = input.nextLine();
                s = input.nextLine();
                System.out.print("Integer : ");
                a = input.nextInt();
                System.out.println("\n-------------------------------------------------\n");
                dummyObj.add(s, a);
                System.out.println("-------------------------------------------------\n");
            }
        }
        input.close();
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