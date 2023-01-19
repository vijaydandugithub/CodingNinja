package L18;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,0,4};
        int min = Collections.min(Arrays.asList(arr));
        System.out.println("min values");
        System.out.println(min);
        int max = Collections.max(Arrays.asList(arr));
        System.out.println("max values");
        System.out.println(max);
    }
}
