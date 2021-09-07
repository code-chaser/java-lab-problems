/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_4.problem_3.example;

import java.util.*;
import java.io.*;

public class PublicClassC implements PublicInterfaceA {

    public void method1() {
        System.out.print("\nvoid method1(); from example.PublicClassC was called.\n");
        return;
    }

    public void method2() {
        System.out.print("\nvoid method2(); from example.PublicClassC was called.\n");
        return;
    }

    public class Class1 {
        public void method() {
            System.out.print("\nvoid method(); from example.PublicClassC.Class1 was called.\n");
            return;
        }
    }

    public class Class2 {
        public void method() {
            System.out.print("\nvoid method(); from example.PublicClassC.Class2 was called.\n");
            return;
        }
    }

    public class Class3 {
        public void method() {
            System.out.print("\nvoid method(); from example.PublicClassC.Class3 was called.\n");
            return;
        }
    }
}
/*
    |---------------------------------------------------|
    |||   https://codeforces.com/profile/codechaser   |||
    |||   https://www.codechef.com/users/codechaser   |||
    |||        https://github.com/code-chaser         |||
    |---------------------------------------------------|
*/