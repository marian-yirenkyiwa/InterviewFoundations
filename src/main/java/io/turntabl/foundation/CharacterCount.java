package io.turntabl.foundation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Qn3
//Write a function that takes a list of characters and returns a total count of each of the characters
// in an appropriate data structure.
public class CharacterCount {
    private List<Character> listOfCharacters;

    public CharacterCount(List<Character>  listOfCharacters){
        this.listOfCharacters = listOfCharacters;
    }

    public List<Character> getListOfCharacters() {
        return listOfCharacters;
    }

    public Map<Character, Integer> totalCountOfCharacters(){
        Map<Character, Integer> charCount= new HashMap<>();
        int counter=0;
        List<Character> charList = getListOfCharacters();

        for(char character:charList) {
            if(!charCount.containsKey(character)){
                charCount.put(character, 1);
            }
            else{
                int getCharValue = charCount.get(character);
                charCount.replace(character, ++getCharValue);
            }
        }
        return charCount;
    }



}
