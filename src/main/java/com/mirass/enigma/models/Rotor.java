package com.mirass.enigma.models;

import java.util.HashMap;

public class Rotor {
    /**
     * identifies the rotor.
     */
    private int id;
    /**
     * Has initial value and increments with one
     * after each keyboard press (granted that it is the first rotor in line)
     */
    private int orientation;
    /**
     * Determines after how keyboard presses the next rotor would move one position forward
     */
    private int initialNotchPosition;
    /**
     * This is unique to each rotor,
     * typically an Enigma machine came with 5 rotors eah with their own mapping
     */
    private HashMap<Character,Character> characterMapping;


}
