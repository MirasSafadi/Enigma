package com.mirass.enigma.models.common;

import lombok.AllArgsConstructor;

import java.util.HashMap;
@AllArgsConstructor
public abstract class Rotor {
    /**
     * identifies the rotor.
     */
    protected int id;
    /**
     * Has initial value and increments with one
     * after each keyboard press (granted that it is the first rotor in line)
     */
    protected char orientation;
    /**
     * Determines after how keyboard presses the next rotor would move one position forward
     */
    protected char notchPosition;
    /**
     * Determines at which character the next rotor turns
     */
    protected char turnover;
    /**
     * This is unique to each rotor,
     * typically an Enigma machine came with 5 rotors eah with their own mapping
     */
    protected HashMap<Character,Character> characterMapping;

    /**
     *
     * @return (Boolean) Whether to turn the next rotor in line
     */
    protected abstract boolean turn();
}
