package edu.hw1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task1Test {

    static int[] answer = {120,66 * 60 + 19,999 * 60 + 59};
    static int i = 0;
    @ParameterizedTest
    @ValueSource(strings = {"02:00","66:19","999:59"})
    void correctTimeOfFilmTest(String time) {
        // given

        // when
        int resultTime1 = Task1.minutesToSeconds(time);

        // then
        assertThat(resultTime1).isEqualTo(answer[i]);
        i++;
    }

    @ParameterizedTest
    @ValueSource(strings = {"-01:00","01:60","11:999"})
    void notCorrectTimeOfFilmTest(String time) {

        int resultTime = Task1.minutesToSeconds(time);

        assertThat(resultTime).isEqualTo(-1);
    }

    @Test
    void emptyTimeOfFilmTest() {
        // given
        String time = "";

        // when
        int resultTime = Task1.minutesToSeconds(time);

        // then
        assertThat(resultTime).isEqualTo(-1);
    }

    @Test
    void nullTimeOfFilmTest() {
        // given

        // when
        int resultTime1 = Task1.minutesToSeconds(null);

        // then
        assertThat(resultTime1).isEqualTo(-1);
    }
}
