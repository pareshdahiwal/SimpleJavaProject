package com.d;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StairCaseTest {

    @Test
    void staircase() {
        // when
        String actual = new StairCase().generate(6);

        // then
        String expected = """
                     #
                    ##
                   ###
                  ####
                 #####
                ######
                """;
        Assertions.assertEquals(expected, actual);
    }
}