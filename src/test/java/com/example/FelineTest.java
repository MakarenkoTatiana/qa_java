package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void checkEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        assertEquals(expectedFood, feline.eatMeat());
    }

    @Test
    public void checkGetFamily() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";

        assertEquals(expectedFamily, feline.getFamily());
    }

    @Test
    public void checkGetKittens() {
        Feline feline = new Feline();
        int expectedKittensCount = 1;

        assertEquals(expectedKittensCount, feline.getKittens());
    }

    @Test
    public void checkGetKittensNewValue() {
        Feline feline = new Feline();
        int expectedKittensCount = 3;

        assertEquals(expectedKittensCount, feline.getKittens(3));
    }
}