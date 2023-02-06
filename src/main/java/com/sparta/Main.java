package com.sparta;

public class Main {
    public static void main(String[] args) {
        System.out.println(palimdrome("racecar"));
        System.out.println(palimdrome("brokenMan"));
        System.out.println(palimdrome("Dad"));
        System.out.println(palimdrome("rosiehurtme"));
        System.out.println(palimdrome("deleveled"));
        System.out.println(palimdrome("rubbish"));
        System.out.println(palimdrome("rotor"));
        System.out.println(palimdrome("madam"));
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
}