package com.java.datastructures.hackerearth;

import com.java.datastructures.hackerearth.challenges.BracketSequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartUp {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            System.out.println(str);
            BracketSequence bs = new BracketSequence();
            int count = bs.countBrackets(str);
            System.out.println(count);
        } catch (IOException e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
