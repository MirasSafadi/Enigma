package com.mirass.enigma.models.NorwayEnigma;

import com.mirass.enigma.models.common.StaticWheel;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The reflector connects the letters in pairs,
 * so it has 13 pairs. e.g. A->Z and Z->A, B->F and F->B.
 */
public class UKW extends StaticWheel {
    // ------------------ ROTOR SPECIFICATIONS ------------------------
    //TODO: replace with use of Utils.initializeMap
    public static final Map<Character, Character> characterMap = Stream.of(
            new AbstractMap.SimpleEntry<>('A', 'M'),
            new AbstractMap.SimpleEntry<>('B', 'O'),
            new AbstractMap.SimpleEntry<>('C', 'W'),
            new AbstractMap.SimpleEntry<>('D', 'J'),
            new AbstractMap.SimpleEntry<>('E', 'Y'),
            new AbstractMap.SimpleEntry<>('F', 'P'),
            new AbstractMap.SimpleEntry<>('G', 'U'),
            new AbstractMap.SimpleEntry<>('H', 'X'),
            new AbstractMap.SimpleEntry<>('I', 'N'),
            new AbstractMap.SimpleEntry<>('J', 'D'),
            new AbstractMap.SimpleEntry<>('K', 'S'),
            new AbstractMap.SimpleEntry<>('L', 'R'),
            new AbstractMap.SimpleEntry<>('M', 'A'),
            new AbstractMap.SimpleEntry<>('N', 'I'),
            new AbstractMap.SimpleEntry<>('O', 'B'),
            new AbstractMap.SimpleEntry<>('P', 'F'),
            new AbstractMap.SimpleEntry<>('Q', 'V'),
            new AbstractMap.SimpleEntry<>('R', 'L'),
            new AbstractMap.SimpleEntry<>('S', 'K'),
            new AbstractMap.SimpleEntry<>('T', 'Z'),
            new AbstractMap.SimpleEntry<>('U', 'G'),
            new AbstractMap.SimpleEntry<>('V', 'O'),
            new AbstractMap.SimpleEntry<>('W', 'C'),
            new AbstractMap.SimpleEntry<>('X', 'H'),
            new AbstractMap.SimpleEntry<>('Y', 'E'),
            new AbstractMap.SimpleEntry<>('Z', 'T')
    ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    public UKW(){
        super((HashMap<Character, Character>) UKW.characterMap);
    }

}
