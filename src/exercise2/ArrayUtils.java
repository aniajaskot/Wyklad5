package exercise2;

import java.util.Random;

public class ArrayUtils {

    protected static int[] generateRandomArray(int size, int upperLimit){
        int[] array = new int[size];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(upperLimit);
        }
        return array;
    }

    static int[] reverse (int[] source){
        int[] result = new int[source.length];
        for(int i = 0; i < source.length; i++){
            result[i] = source[source.length -1 - i];
        }
        return result;
    }

    protected  static int count(int[] source, int number) {
        int counter = 0;
        for (int element: source) {
            if(number == element){
                counter++;
            }
        }
        return counter;
    }
}
