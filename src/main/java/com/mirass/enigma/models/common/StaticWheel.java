package com.mirass.enigma.models.common;

import java.util.HashMap;

public abstract class StaticWheel {
    protected HashMap<Character,Character> characterMapping;

    protected StaticWheel(HashMap<Character,Character> characterMapping){
        this.characterMapping = characterMapping;
    }

    public abstract char getOutCharacter(char inCharacter);
}
