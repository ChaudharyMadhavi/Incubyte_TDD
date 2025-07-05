package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String_Calculator {
    public int add(String num) {
        if (num.isEmpty()) return 0;

        String delimiter = ",|\n";

        if (num.startsWith("//")) {
            Matcher m = Pattern.compile("//\\[(.+)]\\n").matcher(num);
            if (m.find()) {
                delimiter = Pattern.quote(m.group(1));
                num = num.substring(m.end());
    }
            else{
                String[] parts = num.split("\n", 2);
                delimiter = Pattern.quote(parts[0].substring(2)); // IMPORTANT to escape regex
                num = parts[1];
            }

        }

        String[] tokens = num.split(delimiter);
        List<Integer> negatives = new ArrayList<>();

        int sum = 0;
        for (String token : tokens) {
            if(token.isEmpty()) continue;
            int number = Integer.parseInt(token.trim());
            if (number < 0) negatives.add(number);
            sum += number;
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed: " + negatives.toString().replaceAll("[\\[\\]]",""));
    }
        return sum;
    }

}
