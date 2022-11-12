package com.mirass.enigma.utils;

import com.mirass.enigma.models.NorwayEnigma.ETW;
import com.mirass.enigma.models.common.StaticWheel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void getOutCharacterFromStaticWheel() {
        StaticWheel etw = new ETW();
        char actualResult = Utils.getOutCharacterFromStaticWheel('A',etw);
        char expectedResult = 'A';
        assertEquals(expectedResult, actualResult);
    }
}