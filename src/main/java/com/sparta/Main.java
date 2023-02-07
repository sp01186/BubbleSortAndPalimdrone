package com.sparta;

public class Main {
    public static void main(String[] args) {
//        System.out.println(palimdrome("racecar"));
//        System.out.println(palimdrome("brokenMan"));
//        System.out.println(palimdrome("Dad"));
//        System.out.println(palimdrome("rosiehurtme"));
//        System.out.println(palimdrome("deleveled"));
//        System.out.println(palimdrome("rubbish"));
//        System.out.println(palimdrome("rotor"));
//        System.out.println(palimdrome("madam"));
        System.out.println("Hello Genius");
        int[] array = new int[] {1,3,2,6,0, 4};
        int[] answerArray = bubbleSort(array);
        for (int value: answerArray) {
            System.out.println(value);
        }
    }

    public static boolean palimdrome(String word) {
        word = word.toLowerCase();
        boolean answer = false;
        if (word.length() >= 3 && word.length()%2 == 1) {
            answer = true;
            StringBuffer reverseWord = new StringBuffer(word);
            reverseWord.reverse();

            for (int i = 0; i <= (word.length()+1)/2; i++) {
                if (word.charAt(i) != reverseWord.charAt(i)) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }

    public static int[] bubbleSort(int[] intArray) {
        for (int j = intArray.length; j >=0; j--) {
            for (int i = 0; (i+1) < j; i++) {
                if (intArray[i] > intArray[i+1]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[i+1];
                    intArray[i+1] = temp;
                    System.out.println(intArray[i]);
                }
            }
        }
        return intArray;
    }
}