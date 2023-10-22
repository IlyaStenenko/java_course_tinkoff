package edu.hw1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task6Test {
    static int[] answer = {5,4,3};
    static int i = 0;
    @ParameterizedTest
    @ValueSource(ints = {6621,6554,1234})
    void countKTest(int number) {
        assertThat(Task6.countK(number)).isEqualTo(answer[i]);
        i++;
    }

    @ParameterizedTest
    @ValueSource(ints = {100,10000})
    void badNumberCountKTest(int number) {
        assertThat(Task6.countK(number)).isEqualTo(0);
    }
}
