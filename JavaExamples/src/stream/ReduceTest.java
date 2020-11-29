package stream;

import java.util.Arrays;

public class ReduceTest {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.stream(arr).reduce(0, (a,b)-> a + b));
    }
}
