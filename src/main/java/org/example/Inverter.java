package org.example;

public class Inverter {
    public static StringBuilder reverseString(String str) {
        StringBuilder invertedString = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            invertedString.append(str.charAt(i));
        }

        return invertedString;
    }
}
