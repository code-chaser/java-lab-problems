/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_5.problem_2.package1;

import java.util.*;
import java.io.*;

public class Minimum {
    public static int minimum(Vector<Integer> list){
        int result = list.get(0);
        for(int i = 1; i < list.size(); i++) result = list.get(i) < result ? list.get(i) : result;
        return result;
    }
}
/*
    |---------------------------------------------------|
    |||   https://codeforces.com/profile/codechaser   |||
    |||   https://www.codechef.com/users/codechaser   |||
    |||        https://github.com/code-chaser         |||
    |---------------------------------------------------|
*/