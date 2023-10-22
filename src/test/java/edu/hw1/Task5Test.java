package edu.hw1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task5Test {
    @ParameterizedTest
    @ValueSource(ints = {121,1331,123,11})
    void isNumberPalindromeTest(int number) {
        assertTrue(Task5.isPalindromeDescendant(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {13001120,23336014,11211230})
    void hasPalindromeDescendantTest(int number) {
        assertTrue(Task5.isPalindromeDescendant(number));
    }
}