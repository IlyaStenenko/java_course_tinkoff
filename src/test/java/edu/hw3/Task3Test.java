package edu.hw3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.List;
import java.util.stream.Stream;
import static edu.hw3.Task3.frequencyDictionary;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Task3Test {
    static Stream<Arguments> frequencyDictionaryCases() {
        return Stream.of(
                Arguments.of(List.of("a", "bb", "a", "bb"), "{bb=2, a=2}"),
                Arguments.of(List.of("this", "and", "that", "and"), "{that=1, and=2, this=1}"),
                Arguments.of(List.of("код", "код", "код", "bug"), "{код=3, bug=1}"),
                Arguments.of(List.of(1, 1, 2, 2), "{1=2, 2=2}")
        );
    }
    @ParameterizedTest
    @MethodSource("frequencyDictionaryCases")
    void frequencyDictionaryTest(List input, String excepted) {
        assertThat(frequencyDictionary(input)).isEqualTo(excepted);
    }
}