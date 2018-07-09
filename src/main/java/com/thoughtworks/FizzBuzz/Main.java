package com.thoughtworks.FizzBuzz;

public class Main {
    public static void main(String[] args) throws Exception {
        FizzBuzzGame game = new FizzBuzzGame(100);
        System.out.println(game.getResults());
    }
}
