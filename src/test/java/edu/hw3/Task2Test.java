package edu.hw3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static edu.hw3.Task2.clusterize;


class Task2Test {

    static Stream<Arguments> clusterizeCases() {
        return Stream.of(
                Arguments.of("()()()", "[(), (), ()]"),
                Arguments.of("((()))(())()()(()())", "[((())), (()), (), (), (()())]"),
                Arguments.of("((())())(()(()()))", "[((())()), (()(()()))]"),
                Arguments.of(null, ""),
                Arguments.of("", "[]")
        );
    }
    @ParameterizedTest
    @MethodSource("clusterizeCases")
    void clusterizeTest(String input,String excepted) {
        assertThat(clusterize(input)).isEqualTo(excepted);
    }
}