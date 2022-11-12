package com.mirass.enigma.utils;

import com.mirass.enigma.models.common.StaticWheel;

import java.util.Map;

public class Utils {

    public static char getOutCharacterFromStaticWheel(char inCharacter, StaticWheel staticWheel){
        return staticWheel.getOutCharacter(inCharacter);
    }
    public static void initializeMap(Map<Character,Character> characterMap, char[] keys, char[] values)
            throws IllegalArgumentException{
        if(keys.length != values.length){
            throw new IllegalArgumentException("Keys and values must match in length");
        }
        if(characterMap == null || !characterMap.isEmpty()){
            throw new IllegalArgumentException("Character map must be initialized and empty");
        }
        //The sum of all numbers from 1 to 26 is 351
        if(!checkSumOfArray(keys,351)){
            throw new IllegalArgumentException("Repetitive keys");
        }
        if(!checkSumOfArray(values,351)){
            throw new IllegalArgumentException("Repetitive values");
        }
    }

    private static boolean checkSumOfArray(char[] input, int expectedSum) {
        int sum = 0;
        for(char c: input){
            sum += c;
        }
        if(sum != expectedSum){
            return false;
        }
        return true;
    }
}
