package org.example;

public class String_Calculator {
    public int add(String num){
        if (num.isEmpty()) return 0;

        String[] tokens = num.split(",");
        int sum = 0;
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }
        return sum;
    }


}
