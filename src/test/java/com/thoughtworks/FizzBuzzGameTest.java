package com.thoughtworks;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;


public class FizzBuzzGameTest {

    FizzBuzzGame game = new FizzBuzzGame();
    @Test
    public void should_return_Fizz_when_have_3() {
        List<Integer> listHave3 = Arrays.asList(3, 13, 23, 30, 31, 32, 33, 34);

        List<String> results =new ArrayList<>();
        for (Integer i : listHave3){
            results.add(game.numberToResults(i));
        }
        FizzBuzzGame game = new FizzBuzzGame();
        List<String> expectedResults = Arrays.asList( "Fizz",  "Fizz",  "Fizz",  "Fizz",  "Fizz",  "Fizz",  "Fizz", "Fizz");
        assertThat(results, equalTo(expectedResults));
    }

    @Test
    public void should_return_Fizz_when_is_the_multiple_of_3() {
        assertThat("Fizz", equalTo(game.numberToResults(9)));
    }

    @Test
    public void should_return_Buzz_when_is_the_multiple_of_5() {
        assertThat("Buzz", equalTo(game.numberToResults(10)));
    }

    @Test
    public void should_return_Whizz_when_is_the_multiple_of_7() {
        assertThat("Whizz", equalTo(game.numberToResults(14)));
    }

    @Test
    public void should_return_FizzBuzz_when_is_the_multiple_of_3_and_5() {
        assertThat("FizzBuzz", equalTo(game.numberToResults(15)));
    }

    @Test
    public void should_return_FizzWhizz_when_is_the_multiple_of_3_and_7() {
        assertThat("FizzWhizz", equalTo(game.numberToResults(21)));
    }

    @Test
    public void should_return_BuzzWhizz_when_is_the_multiple_of_5_and_7() {
        assertThat("BuzzWhizz", equalTo(game.numberToResults(70)));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_is_the_multiple_of_3_and_5_and_7() {
        assertThat("FizzBuzzWhizz", equalTo(game.numberToResults(105)));
    }
}
