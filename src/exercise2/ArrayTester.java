package exercise2;

import java.util.Arrays;

public class ArrayTester {
    public static void main(String[] args) {
        int[] generated = ArrayUtils.generateRandomArray(10, 20);
        System.out.println("Wylosowane tablica " + Arrays.toString(generated));

        int[] reversed = ArrayUtils.reverse(generated);
        System.out.println("Tablica odwrócona " + Arrays.toString(reversed));

        int count5 = ArrayUtils.count(generated, 5);
        System.out.println("Liczba 5 występuje " + count5 + " razy");
    }
}
