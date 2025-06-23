package com.daknight.generator.util.generators;

import com.daknight.generator.util.lib.Characters;
import com.daknight.generator.util.lib.Numbers;
import com.daknight.generator.util.lib.SpecialChars;

import java.util.Random;

public class PasswordGenerator {
    private static int MAX_BIG_CHARS = 5;
    private static int MAX_SMALL_CHARS = 5;
    private static int MAX_SPECIAL_CHARS = 5;
    private static int MAX_NUMBERS = 5;
    private static Random random = new Random();

    private static char[] generatedBigChars() {
        char[] generated = new char[MAX_BIG_CHARS];

        for (int i = 0; i < MAX_BIG_CHARS; i++) {
            generated[i] = Characters.bigChars[random.nextInt(Characters.bigChars.length)];
        }
        return generated;
    }

    private static char[] generatedSmallChars() {
        char[] generated = new char[MAX_SMALL_CHARS];

        for (int i = 0; i < MAX_SMALL_CHARS; i++) {
            generated[i] = Characters.smallChars[random.nextInt(Characters.smallChars.length)];
        }
        return generated;
    }

    private static char[] generatedSpecialChars() {
        char[] generated = new char[MAX_SPECIAL_CHARS];

        for (int i = 0; i < MAX_SMALL_CHARS; i++) {
            generated[i] = SpecialChars.specialChars[random.nextInt(SpecialChars.specialChars.length)];
        }
        return generated;
    }

    private static int[] generatedNumbers() {
        int[] generated = new int[MAX_NUMBERS];

        for (int i = 0; i < MAX_NUMBERS; i++) {
            generated[i] = Numbers.numbers[random.nextInt(Numbers.numbers.length)];
        }
        return generated;
    }

    public static String generatePassword() {
        int totalLength = MAX_BIG_CHARS + MAX_SMALL_CHARS + MAX_SPECIAL_CHARS + MAX_NUMBERS;
        String[] username = new String[totalLength];

        char[] bigChars = generatedBigChars();
        char[] smallChars = generatedSmallChars();
        char[] specialChars = generatedSpecialChars();
        int[] numbers = generatedNumbers();
        int index = 0;

        for (char c : bigChars) {
            username[index++] = String.valueOf(c);
        }

        for (char c : smallChars) {
            username[index++] = String.valueOf(c);
        }

        for (char c : specialChars) {
            username[index++] = String.valueOf(c);
        }

        for (int i : numbers) {
            username[index++] = String.valueOf(i);
        }



        StringBuilder generatedUsername = new StringBuilder();

        for (int i = 0; i < totalLength; i++) {
            int randomIndex = random.nextInt(username.length);
            generatedUsername.append(username[randomIndex]);

        }
        return generatedUsername.toString();
    }
}
