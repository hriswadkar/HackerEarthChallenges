package com.java.datastructures.hackerearth.challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BracketSequence {
    // The solution provided here is not fully accepted.
    // Need to work on final solution
    public int countBrackets(String str) {
        int openBracket = 0;
        int leftCounter = 0;
        int rightCounter = 0;
        for(char c:str.toCharArray()) {
            if(c == '(') {
                openBracket++;
                leftCounter++;
            }
            if(c == ')') {
                openBracket--;
                rightCounter++;
            }
        }

        if(openBracket == 0) {
            return ((leftCounter+rightCounter)/2);
        }

        return 0;
    }
}
