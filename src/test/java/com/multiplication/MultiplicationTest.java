package com.multiplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MultiplicationTest {

    private Multiplication multiplication;
    private ByteArrayOutputStream output;

    @BeforeEach
    void setUp() {
        multiplication = new Multiplication();
        // Capturamos salida estándar para verificar consola
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    void printTable_ShouldPrintCorrectNumberOfLines() {
        multiplication.n = 5;
        multiplication.printTable();

        String[] lines = output.toString().trim().split(System.lineSeparator());
        assertThat(lines.length, is(equalTo(11))); // de 0 a 10
    }

    @Test
    void printTable_ShouldPrintCorrectMultiplicationFormat() {
        multiplication.n = 7;
        multiplication.printTable();

        String[] lines = output.toString().trim().split(System.lineSeparator());
        assertThat(lines[0], equalTo("7 x 0 = 0"));
        assertThat(lines[10], equalTo("7 x 10 = 70"));
    }
}
