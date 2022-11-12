package com.mirass.enigma.utils;

import com.mirass.enigma.models.NorwayEnigma.ETW;
import com.mirass.enigma.models.NorwayEnigma.UKW;
import com.mirass.enigma.models.common.StaticWheel;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void test_getOutCharacterFromStaticWheel_when_A_is_passed_A_should_be_returned_from_ETW() {
        StaticWheel etw = new ETW();
        char actualResult = Utils.getOutCharacterFromStaticWheel('A',etw);
        char expectedResult = 'A';
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void test_getOutCharacterFromStaticWheel_when_A_is_passed_M_should_be_returned_from_EKW() {
//      MOWJYPUXNDSRAIBFVLKZGOCHET
        StaticWheel ukw = new UKW();
        char actualResult = Utils.getOutCharacterFromStaticWheel('A',ukw);
        char expectedResult = 'M';
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void test_initializeMap_repetitive_keys(){
        //MOWJYPUXNDSRAIBFVLKZGOCHET
        //ABCDEFGHIJKLMNOPQRSTUVWXYZ
        HashMap<Character,Character> characterHashMap = new HashMap<>();
        char[] keys = {'A','B','A','D','E','F','G','H','I','J','K','L','M',
                'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] values = {'M','O','W','J','Y','P','U','X','N','D','S','R','A'
                ,'I','B','F','V','L','K','Z','G','O','C','H','E','T'};

        Exception exception = assertThrows(IllegalArgumentException.class, () ->{
            Utils.initializeMap(characterHashMap,keys,values);
        });
        String expectedExceptionMessage = "Repetitive keys";
        String actualExceptionMessage = exception.getMessage();

        assertEquals(expectedExceptionMessage,actualExceptionMessage);
    }
     //TODO: 4 more tests for initializeMap
}