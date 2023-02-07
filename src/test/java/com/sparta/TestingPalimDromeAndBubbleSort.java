package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TestingPalimDromeAndBubbleSort {

    //        System.out.println(palimdrome("racecar"));
//        System.out.println(palimdrome("brokenMan"));
//        System.out.println(palimdrome("Dad"));
//        System.out.println(palimdrome("rosiehurtme"));
//        System.out.println(palimdrome("deleveled"));
//        System.out.println(palimdrome("rubbish"));
//        System.out.println(palimdrome("rotor"));
//        System.out.println(palimdrome("madam"));
    @ParameterizedTest
    @ValueSource(strings = {"racecar", "Dad", "deleveled", "rotor", "madam"})
    @DisplayName("Correctly predicted palindromes")
    public void testingCorrectPalimdrones(String word) {
        Assertions.assertTrue(Tools.palimdrome(word));
    }

    @ParameterizedTest
    @ValueSource(strings = {"brokenMan", "ItHurtsMe", "rubbish", "sadface", "IWillGetBetter"})
    @DisplayName("Correctly predicted words that are not palindromes")
    public void testingWrongPalimdrones(String word) {
        Assertions.assertFalse(Tools.palimdrome(word));
    }

    @Test
    @DisplayName("Testing my bublesort algorithm works")
    public void testingBubbleSort() {
        int[] intArray = new int[] {3, 2, 5, 6, 3, 8, 12};
        int[] answerArray = new int[] {2, 3, 3, 5, 6, 8, 12};
        Assertions.assertTrue(Arrays.equals(Tools.bubbleSort(intArray), answerArray));
    }

}