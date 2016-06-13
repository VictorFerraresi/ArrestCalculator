package br.com.calculator.utils;


public class NumberUtils {
    
    public static boolean isNumeric(String str){
        return str.matches("-?\\d+(\\.\\d+)?");
    }    
    
}
