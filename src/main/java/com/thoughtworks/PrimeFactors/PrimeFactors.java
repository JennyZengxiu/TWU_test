package com.thoughtworks.PrimeFactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    private List<Integer> factors = new ArrayList<>();
    public List<Integer> generate(int number){
        for (int i = 2; i <= number ; i++) {
            if (number % i == 0){
                factors.add(i);
                number = number / i;
            }
        }
        return factors;
    }
}
