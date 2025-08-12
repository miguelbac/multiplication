package com.multiplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AppTest {

    private ByteArrayOutputStream output;

    @BeforeEach
    void setUp() {
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @Test
    void main_ShouldPrintMultiplicationTableFor5() {
        App.main(new String[]{});

        String console = output.toString().trim();
        assertThat(console, containsString("5 x 0 = 0"));
        assertThat(console, containsString("5 x 10 = 50"));
    }
}
