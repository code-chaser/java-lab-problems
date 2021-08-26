/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_1.problem_2;

import java.util.*;
import java.io.*;

class Addition {
    private double value;

    public Addition() {
        value = 0;
    }

    public Addition(double n1, double n2) {
        value = n1 + n2;
    }

    public Addition(double n1, double n2, double n3) {
        value = n1 + n2 + n3;
    }

    public Addition(double n1, double n2, double n3, double n4) {
        value = n1 + n2 + n3 + n4;
    }

    public void printValue() {
        System.out.print(value + "\n");
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