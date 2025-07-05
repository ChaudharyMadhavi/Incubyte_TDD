package org.example;

import java.util.regex.Pattern;

public class String_Calculator {
    public int add(String num) {
        if (num.isEmpty()) return 0;

        String delimiter = ",|\n";

        if (num.startsWith("//")) {
            String[] parts = num.split("\n", 2);
            delimiter = Pattern.quote(parts[0].substring(2)); // IMPORTANT to escape regex
            num = parts[1];
        }

        String[] tokens = num.split(delimiter);

        int sum = 0;
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }
        return sum;
    }

}
