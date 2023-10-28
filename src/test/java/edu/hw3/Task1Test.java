package edu.hw3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static edu.hw3.Task1.shifrAtbash;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class Task1Test {
    @ParameterizedTest
    @CsvSource({
            "Hello world!, Svool dliow!",
            "12345, 12345",
            "@#$%, @#$%"
    })
    void shifrAtbashTest(String input,String expected) {
        assertThat(shifrAtbash(input)).isEqualTo(expected);
    }
}