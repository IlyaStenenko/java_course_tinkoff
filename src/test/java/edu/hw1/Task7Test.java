package edu.hw1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task7Test {
    static int[] shifts = {1,2,2};
    static int[] answerLeft = {1,6,31427};
    static int i = 0;
    @ParameterizedTest
    @ValueSource(ints = {16,17,32432})
    void rotateLeftTest(int number) {
        int result = Task7.rotateLeft(number, shifts[i]);

        assertThat(result).isEqualTo(answerLeft[i]);
        i++;
    }

    static int g = 0;
    static int[] answerRight = {4,0,2858};
    @ParameterizedTest
    @ValueSource(ints = {8,0,3242})
    void rotateRightTest(int number) {

        int result = Task7.rotateRight(number, shifts[g]);

        assertThat(result).isEqualTo(answerRight[g]);
        g++;
    }
}
