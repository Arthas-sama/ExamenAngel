package com.cebem.transformatolotu.utils;

public class Utils {

    public static String cuenta(String palabra) {
        int condor = 0;
        for (int x = 0; x < palabra.length(); x++) {
            if ((palabra.charAt(x) == 'a') || (palabra.charAt(x) == 'A')){
                condor++;
            }

        }
        return "La palabra " + palabra + " contiene " + condor + " A ";
    }
}