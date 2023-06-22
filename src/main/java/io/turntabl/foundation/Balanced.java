package io.turntabl.foundation;

public class Balanced {
    public boolean isBalanced(String parentheses){
        int openingParenthesesCount = 0;
        int closingParenthesesCount = 0;

        //for each loop to count number of closing and opening parentheses
        for(var c: parentheses.toCharArray()){
            if(c == '('){
                openingParenthesesCount++;
            }else if(c == ')'){
                closingParenthesesCount++;
            }

            if(openingParenthesesCount < closingParenthesesCount){
                return false;
            }

        }
        return openingParenthesesCount == closingParenthesesCount;
    }
}
