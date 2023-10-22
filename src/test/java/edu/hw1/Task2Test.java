package edu.hw1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task2Test {

    static int[] answer = {4,3};
    static int i = 0;
    @ParameterizedTest
    @ValueSource(ints = {4060,544})
    void positiveNumberTest(int number) {

        int resultCount = Task2.countDigits(number);

        assertThat(resultCount).isEqualTo(answer[i % 2]);
        i++;
    }


    @ParameterizedTest
    @ValueSource(ints = {-4000,-504})
    void negativeNumberTest(int number) {

        int resultCount = Task2.countDigits(number);

        assertThat(resultCount).isEqualTo(answer[i % 2]);
        i++;
    }

    @Test
    void zeroNumberTest() {
        int number = 0;

        int resultCount = Task2.countDigits(number);

        assertThat(resultCount).isEqualTo(1);
    }
}