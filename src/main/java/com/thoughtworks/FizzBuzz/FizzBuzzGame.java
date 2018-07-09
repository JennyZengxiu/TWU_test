package com.thoughtworks.FizzBuzz;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();
    private int count;

    public FizzBuzzGame(int count) {
        this.count = count;
    }

    public List<String> getResults() {
        for (int i = 1; i <= count; i++) {
            results.add(numberToResults(i));
        }
        return results;
    }

    public String numberToResults(int i) {
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (result == "") {
            result = Integer.toString(i);
        }
        return result;
    }
}


