/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_4.problem_3.example;

import java.util.*;
import java.io.*;

public class PublicClassA {
    public void method1() {
        System.out.print("\nvoid method1(); from example.PublicClassA was called.\n");
        PrivateClassA A = new PrivateClassA();
        A.method1();
        return;
    }

    public void method2() {
        System.out.print("\nvoid method2(); from example.PublicClassA was called.\n");
        PrivateClassA A = new PrivateClassA();
        A.method2();
        return;
    }

    private class PrivateClassA {
        public void method1() {
            System.out.print("\nvoid method1(); from example.PublicClassA.PrivateClassA was called.\n");
            return;
        }

        public void method2() {
            System.out.print("\nvoid method2(); from example.PublicClassA.PrivateClassA was called.\n");
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