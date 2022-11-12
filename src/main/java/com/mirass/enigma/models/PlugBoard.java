package com.mirass.enigma.models;

import com.mirass.enigma.utils.Constants;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
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
        initDefaultPlugBoard(this.plugs);
        if(cables == null || cables.isEmpty()) {
            return;
        }
        if(isCustomPlugBoardValid(cables)){
            configurePlugBoard(cables);
        }
    }

    /**
     *
     * @param cables
     */
    private void configurePlugBoard(HashMap<Character,Character> cables){
        this.plugs.replaceAll((key,oldValue)->cables.get(key));
    }

    /**
     *
     * @param customPlugBoard
     * @return
     */
    private boolean isCustomPlugBoardValid(HashMap<Character,Character> customPlugBoard){
        boolean isValid;
        customPlugBoard.size();
        isValid = customPlugBoard.size() <= Constants.MAX_PLUGS_COUNT;
        return isValid;
    }

    /**
     *
     * @param plugBoard
     */
    private void initDefaultPlugBoard(HashMap<Character,Character> plugBoard){
        for(char ch: Constants.CHARS){
            plugBoard.put(ch,ch);
        }
    }
}
