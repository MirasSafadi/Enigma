package com.mirass.enigma.utils;

import com.mirass.enigma.models.common.StaticWheel;

public class Utils {

    public static char getOutCharacterFromStaticWheel(char inCharacter, StaticWheel staticWheel){
        return staticWheel.getOutCharacter(inCharacter);
    }
}
