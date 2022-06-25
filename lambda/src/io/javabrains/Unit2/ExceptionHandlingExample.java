package io.javabrains.Unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int key = 2;


        process(numbers, key, (v1, k1) -> System.out.println(v1 + k1));
        System.out.println("----------------------");
        process(numbers, key, (v1, k1) -> System.out.println(v1 / k1));
        int key1 = 0;
        process(numbers, key1, (v1, k1) -> {
            try {
                System.out.println(v1 / k1);
            } catch (ArithmeticException e) {
                System.out.println("divided by zero");
            }
        });

        int key2 = 0;
        process(numbers, key2, wraperLambda((v1, k1) -> System.out.println(v1 / k1)));

    }

    private static void process(int[] numbers, int k, BiConsumer<Integer, Integer> consumer) {
        for (int i : numbers) {
            /*
            try{
                consumer.accept(i,k);
            }catch(ArithmeticException e){
                //let lambda do it
            }
            */
            consumer.accept(i, k);
        }
    }

    //this is a true wraper now
    private static BiConsumer<Integer, Integer> wraperLambda(BiConsumer<Integer, Integer> consumer) {
        //return consumer;
        //return (v1,k1)-> System.out.println(v1+k1);
        //return (v1,k1)-> consumer.accept(v1,k1);
        return (v1, k1) -> {
            try {
                consumer.accept(v1, k1);
            } catch (ArithmeticException e) {
                System.out.println("oooooooooooo");
            }
        };
    }
}