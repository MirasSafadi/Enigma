package com.mirass.enigma.models.NorwayEnigma;

import com.mirass.enigma.models.common.StaticWheel;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ETW extends StaticWheel {
    // ------------------ ROTOR SPECIFICATIONS ------------------------
    public static final Map<Character, Character> characterMap = Stream.of(
            new AbstractMap.SimpleEntry<>('A', 'A'),
            new AbstractMap.SimpleEntry<>('B', 'B'),
            new AbstractMap.SimpleEntry<>('C', 'A'),
            new AbstractMap.SimpleEntry<>('D', 'B'),
            new AbstractMap.SimpleEntry<>('E', 'A'),
            new AbstractMap.SimpleEntry<>('F', 'B'),
            new AbstractMap.SimpleEntry<>('G', 'B'),
            new AbstractMap.SimpleEntry<>('H', 'B'),
            new AbstractMap.SimpleEntry<>('I', 'B'),
            new AbstractMap.SimpleEntry<>('J', 'B'),
            new AbstractMap.SimpleEntry<>('K', 'B'),
            new AbstractMap.SimpleEntry<>('L', 'B'),
            new AbstractMap.SimpleEntry<>('M', 'B'),
            new AbstractMap.SimpleEntry<>('N', 'B'),
            new AbstractMap.SimpleEntry<>('O', 'B'),
            new AbstractMap.SimpleEntry<>('P', 'B'),
            new AbstractMap.SimpleEntry<>('Q', 'B'),
            new AbstractMap.SimpleEntry<>('R', 'B'),
            new AbstractMap.SimpleEntry<>('S', 'B'),
            new AbstractMap.SimpleEntry<>('T', 'B'),
            new AbstractMap.SimpleEntry<>('U', 'B'),
            new AbstractMap.SimpleEntry<>('V', 'B'),
            new AbstractMap.SimpleEntry<>('W', 'B'),
            new AbstractMap.SimpleEntry<>('X', 'B'),
            new AbstractMap.SimpleEntry<>('Y', 'B'),
            new AbstractMap.SimpleEntry<>('Z', 'B')
    ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    public ETW(){
        super((HashMap<Character, Character>) ETW.characterMap);
    }

    @Override
    public char getOutCharacter(char inCharacter) {
        return this.characterMapping.get(inCharacter);
    }
}
