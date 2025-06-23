package com.daknight.generator.tests;

import com.daknight.generator.util.lib.Characters;
import com.daknight.generator.util.lib.Numbers;
import com.daknight.generator.util.lib.SpecialChars;

import java.util.Arrays;

public class TestingLib {
    public static void main(String[] args) {
        System.out.println(Characters.bigChars);
        System.out.println("---");
        System.out.println(Characters.smallChars);
        System.out.println("---");
        System.out.println(Arrays.toString(Numbers.numbers));
        System.out.println("---");
        System.out.println(SpecialChars.specialChars);
    }
}
