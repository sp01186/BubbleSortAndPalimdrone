package com.sparta;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Genius");
        int[] array = new int[] {1,3,2,6,0, 4};
        int[] answerArray = Tools.bubbleSort(array);
        for (int value: answerArray) {
            System.out.println(value);
        }
    }
}