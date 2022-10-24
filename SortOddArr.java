package CodeWars;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 *   [5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
 */
public class SortOddArr {
    public static void main(String[] args) {
        int[] a = {5, 3, 2, 8, 1, 4};
        System.out.println(Arrays.toString(sortArray3(a)));
    }
    // using Stream - higherOrderMethods
    public static int[] sortArray3(int[] array){
        int[] sortedArr = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();

        for (int i = 0, j=0; i < array.length; i++) {
            if(array[i] % 2 == 1) array[i]= sortedArr[j++];
        }

        return array;
    }

    //method 1
    public static int[] sortArray2(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if(array[i] > array[j] && array[i] % 2 == 1 && array[j] % 2 == 1){
                    int t = array[i];
                    array[i] = array[j];
                    array[j] = t;
                }
            }
        }
        return array;
    }
}
