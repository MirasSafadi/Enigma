package com.mirass.enigma.models;

import com.mirass.enigma.utils.Constants;
import java.util.HashMap;

public class PlugBoard {
    private HashMap<Character,Character> plugs;

    public PlugBoard(HashMap<Character,Character> customPlugBoard){
        if(customPlugBoard == null || customPlugBoard.isEmpty()){
            this.plugs = new HashMap<>();
            initDefaultPlugBoard(this.plugs);
        } else{
            this.plugs = customPlugBoard;
        }
    }

    private void initDefaultPlugBoard(HashMap<Character,Character> plugBoard){
        for(char ch: Constants.chars){
            plugBoard.put(ch,ch);
        }
    }
}
