package com.example.tp2tdd;

public class Calculator {

    public String divisible(int a,int b, int c){
        if (a%b == 0 && a%c == 0){return Integer.toString(b+c);}
        else if (a%c == 0){return Integer.toString(c);}
        else if (a%b == 0 ){return Integer.toString(b);}
        return "test";

    }
}
