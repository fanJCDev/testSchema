package mthree_interview;

import java.util.Arrays;
import java.util.stream.Stream;

public class sumElementNestedArray {

    private static Stream<Object> summation(Object[] array) {
        return Arrays.stream(array)
                .flatMap(o -> o.getClass().isArray() ?
                        summation((Object[]) o) :
                        Stream.of(o));
    }

    public static void main(String args[]) {

        Integer[][][] array = {
                {
                        {9, 10},

                        {1, 2, 3}, {4, 5}, {6, 7, 8}

                }
        };
        Integer[][][] array1 = {};
        int sum = summation(array)
                .mapToInt(i -> (int) i)
                .sum();
        System.out.println("Weighted Sum is: " + sum);

    }
}
