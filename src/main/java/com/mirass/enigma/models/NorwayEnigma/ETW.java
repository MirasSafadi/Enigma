package com.mirass.enigma.models.NorwayEnigma;

import com.mirass.enigma.models.common.StaticWheel;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The input wheel passes the signal from the plug board to the rotors
 */
public class ETW extends StaticWheel {
    // ------------------ ROTOR SPECIFICATIONS ------------------------
    //TODO: replace with use of Utils.initializeMap
    public static final Map<Character, Character> characterMap = Stream.of(
            new AbstractMap.SimpleEntry<>('A', 'A'),
            new AbstractMap.SimpleEntry<>('B', 'B'),
            new AbstractMap.SimpleEntry<>('C', 'C'),
            new AbstractMap.SimpleEntry<>('D', 'D'),
            new AbstractMap.SimpleEntry<>('E', 'E'),
            new AbstractMap.SimpleEntry<>('F', 'F'),
            new AbstractMap.SimpleEntry<>('G', 'G'),
            new AbstractMap.SimpleEntry<>('H', 'H'),
            new AbstractMap.SimpleEntry<>('I', 'I'),
            new AbstractMap.SimpleEntry<>('J', 'J'),
            new AbstractMap.SimpleEntry<>('K', 'K'),
            new AbstractMap.SimpleEntry<>('L', 'L'),
            new AbstractMap.SimpleEntry<>('M', 'M'),
            new AbstractMap.SimpleEntry<>('N', 'N'),
            new AbstractMap.SimpleEntry<>('O', 'O'),
            new AbstractMap.SimpleEntry<>('P', 'P'),
            new AbstractMap.SimpleEntry<>('Q', 'Q'),
            new AbstractMap.SimpleEntry<>('R', 'R'),
            new AbstractMap.SimpleEntry<>('S', 'S'),
            new AbstractMap.SimpleEntry<>('T', 'T'),
            new AbstractMap.SimpleEntry<>('U', 'U'),
            new AbstractMap.SimpleEntry<>('V', 'V'),
            new AbstractMap.SimpleEntry<>('W', 'W'),
            new AbstractMap.SimpleEntry<>('X', 'X'),
            new AbstractMap.SimpleEntry<>('Y', 'Y'),
            new AbstractMap.SimpleEntry<>('Z', 'Z')
    ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    public ETW(){
        super((HashMap<Character, Character>) ETW.characterMap);
    }
}
