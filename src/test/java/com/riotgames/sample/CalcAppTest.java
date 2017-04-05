package com.riotgames.sample;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Unit test for simple CalcApp.
 */
public class CalcAppTest {
    @Test
    public void testCalcAppDoesCorrectAddOperation() {
        String[] args = new String[] { "1", "(", "2" };

        CalcApp app = new CalcApp();
        double result = app.calc(args);
        assertThat(result, is(3.0));
    }
}
