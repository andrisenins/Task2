package com.accenture;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArray {

    public static void main(String[] args) {
        System.out.print("Input array size: ");
        Scanner read = new Scanner(System.in);
        int sizeOfAnArray = read.nextInt();
        long[] array = createRandomFilledArray(sizeOfAnArray);
        printAnArray(array);
        printMinimalValue(array);
        getMaximal(array);
        printMeanValue(array);
    }

    private static void printMeanValue(long[] array) {
        long sum = 0;
        for (long entry : array) {
            sum +=  entry;
        }
        System.out.println("Average value: " + (sum / array.length));


    }

    private static void printMinimalValue(long[] array) {
        long minimalValue = array[0];
        for (long nextValue : array) {
            if (minimalValue >= nextValue) {
                minimalValue = nextValue;
            }
        }
        System.out.println("Arrays smallest value" + minimalValue);
    }

    private static void getMaximal(long[] array) {
        long maxValue = array[0];
        for (long nextValue : array) {
            if (nextValue >= maxValue) {
                maxValue = nextValue;
            }
        }
        System.out.println("Maximal value: " + maxValue);
    }

    private static void printAnArray(long[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static long[] createRandomFilledArray(int size) {
        long[] array = new long[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextLong();
        }
        return array;
    }


}
