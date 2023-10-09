package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void checkEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

        assertEquals(feline.eatMeat(),expectedFood);
    }

    @Test
    public void checkGetFamily() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";

        assertEquals(feline.getFamily(),expectedFamily);
    }

    @Test
    public void checkGetKittens() {
        Feline feline = new Feline();
        int expectedKittensCount = 1;

        assertEquals(feline.getKittens(),expectedKittensCount);
    }

    @Test
    public void checkGetKittensNewValue() {
        Feline feline = new Feline();
        int expectedKittensCount = 3;

        assertEquals(feline.getKittens(3),expectedKittensCount);
    }
}