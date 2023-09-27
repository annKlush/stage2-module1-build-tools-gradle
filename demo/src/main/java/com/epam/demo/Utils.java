package com.epam.demo;

import java.util.List;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String str : args) {
            if (!isPositiveNumber(str)) {
                return false; // If any string is not a positive number, return false
            }
        }
        return true; // All strings in the list are positive numbers
    }

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