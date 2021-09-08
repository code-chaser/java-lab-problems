/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~
--||author : codechaser||-- 
~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/
package java_labs.lab_5.problem_2.package1;

import java.util.*;
import java.io.*;

public class Sum {
    public static int sum(Vector<Integer> list){
        int result = 0;
        for(int i = 0; i < list.size(); i++) result += list.get(i);
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