package SumNumbers;

import java.util.Arrays;

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        int[] array = new int[3];
        array[0]=a;
        array[1] =b;
        array[2] =c;
        Arrays.sort(array);
        if(Math.abs(array[0]-array[1])==Math.abs(array[1]-array[2])) return true;
        return false;
    }

}
