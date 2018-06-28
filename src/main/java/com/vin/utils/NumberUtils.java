package com.vin.utils;

public class NumberUtils {

    public static boolean isValidNum(String args) {
        try {
             Integer.parseInt(args);
        } catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }

    public static int transStringToInt(String args) {
        return Integer.parseInt(args);
    }
}
