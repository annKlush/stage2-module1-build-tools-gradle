package com.epam.demo;
import java.util.List;
import com.epam.utils.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String str : args) {
            if (!StringUtils.isPositiveNumber(str)) {
                return false; // If any string is not a positive number, return false
            }
        }
        return true; // All strings in the list are positive numbers
    }
}