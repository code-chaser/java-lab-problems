/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_4.problem_3.example;

import java.util.*;
import java.io.*;

public class PublicClassB {
    public void method1() {
        System.out.print("\nvoid method1(); from example.PublicClassB was called.\n");
        ProtectedClassA A = new ProtectedClassA();
        A.method1();
        return;
    }

    public void method2() {
        System.out.print("\nvoid method2(); from example.PublicClassB was called.\n");
        ProtectedClassA A = new ProtectedClassA();
        A.method2();
        return;
    }

    protected class ProtectedClassA {
        public void method1() {
            System.out.print("\nvoid method1(); from example.PublicClassA.ProtectedClassA was called.\n");
            return;
        }

        public void method2() {
            System.out.print("\nvoid method2(); from example.PublicClassA.ProtectedClassA was called.\n");
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