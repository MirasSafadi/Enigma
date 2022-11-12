package com.mirass.enigma.models.common;

import com.mirass.enigma.utils.Constants;
import lombok.Getter;

import java.util.HashMap;

@Getter
public class PlugBoard {
     /**
     * The plugs on the plug board.
     * It is basically a mapping of letters in pairs or to each other.
     */
    private HashMap<Character,Character> plugs;

    /**
     * Initialize the plug board (in reality this is like plugging in the cables)
     *
     * @param cables
     */
    public PlugBoard(HashMap<Character,Character> cables){
        this.plugs = new HashMap<>();
        setPlugs(cables);
    }

    /**
     *
     * @param cables
     */
    private void configurePlugBoard(HashMap<Character,Character> cables){
        this.plugs.replaceAll((key,oldValue)->cables.get(key));
    }

    /**
     * Checks that the number of cables and the configuration is correct
     * @param cables The settings of the cables
     * @return (Boolean) Whether the cable configuration is correct or not.
     */
    private boolean isCustomPlugBoardValid(HashMap<Character,Character> cables){
        boolean isValid;
        cables.size();
        isValid = cables.size() <= Constants.MAX_PLUGS_COUNT;
        //TODO: Check that there's no mapping to the same character
        return isValid;
    }

    /**
     * Initilizes the plug board with no cables plugged in.
     */
    private void initDefaultPlugBoard(){
        for(char ch: Constants.CHARS){
            this.plugs.put(ch,ch);
        }
    }

    /**
     * Change the settings of the plug board.
     * @param cables The new settings of the plug board
     */
    public void setPlugs(HashMap<Character, Character> cables) {
        initDefaultPlugBoard();
        if(cables == null || cables.isEmpty()) {
            return;
        }
        if(isCustomPlugBoardValid(cables)){
            configurePlugBoard(cables);
        }
    }
}
