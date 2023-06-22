package io.turntabl.foundation;

import org.w3c.dom.ls.LSOutput;

public class BalancedParentheses {
    private String word;

    public BalancedParentheses(String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public String checkBalancedParentheses(){
        char[] storeWord = getWord().toCharArray();
        String message = "";
//        int lastIndex = storeWord.length - 1;
//
//        if(!(storeWord[0] == '(' && storeWord[lastIndex] == ')')){
//            message = "Not balanced parentheses";
//        }
//        else{
//            message = "Balanced parentheses";
//        }

        if(storeWord.length % 2 == 0){
            message = "Balanced parentheses";
        }else{
            message = "Not balanced parentheses";
        }
        return message;
    }
}
