package com.mirass.enigma.models.NorwayEnigma;

import com.mirass.enigma.models.common.Rotor;

import java.util.HashMap;

public class RotorI extends Rotor {


    public RotorI(int id, char orientation, char notchPosition, char turnover, HashMap<Character, Character> characterMapping) {
        super(id, orientation, notchPosition, turnover, characterMapping);
    }

    @Override
    protected boolean turn() {
        return false;
    }
}
