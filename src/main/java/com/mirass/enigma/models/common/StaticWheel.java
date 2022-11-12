package com.mirass.enigma.models.common;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.HashMap;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class StaticWheel {
    protected HashMap<Character,Character> characterMapping;

    public char getOutCharacter(char inCharacter){
        return this.characterMapping.get(inCharacter);
    }
}
