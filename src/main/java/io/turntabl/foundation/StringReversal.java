package io.turntabl.foundation;

//Qn2
//Take a string as input and reverse it, you don't need to read from the command line.
// You can test your function by calling it directly.
public class StringReversal {
    private String word;

    public StringReversal(String word){
        this.word = word;
    }

    public String reverseWord(){
        //split the word into an array of strings
        String[] wordSplit = getWord().split("\\s");
        String reversedWord="";

        for(String w:wordSplit){
            StringBuilder stringBuilder = new StringBuilder(w);
            stringBuilder.reverse();
            reversedWord+= stringBuilder.toString() + " ";
        }
        return reversedWord.trim();
    }

    public String getWord() {
        return word;
    }
}
