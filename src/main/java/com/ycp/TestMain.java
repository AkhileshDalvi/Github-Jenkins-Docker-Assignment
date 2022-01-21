package com.ycp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestMain {
	@Test
    public void testInputIsEven(){
        assertTrue(App.checkIfInputIsAnEvenNumber(22)); // Assertion
    }
}
