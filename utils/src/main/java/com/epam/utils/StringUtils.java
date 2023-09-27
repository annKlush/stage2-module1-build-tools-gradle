package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        if (str == null || str.isEmpty()) {
            return false; // Empty or null strings are not positive numbers
        }

        try {
            double number = Double.parseDouble(str); // Attempt to parse the string as a double
            return number > 0; // Check if the parsed number is greater than zero
        } catch (NumberFormatException e) {
            return false; // Parsing failed, so it's not a valid number
        }
    }
}