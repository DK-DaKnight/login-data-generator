package com.daknight.generator.util.generators;

import com.daknight.generator.util.lib.Characters;

import java.util.Random;

import static java.lang.Math.random;

public class UsernameGenerator {
    private static final int MAX_BIG_CHARS = 5;
    private static final int MAX_SMALL_CHARS = 5;
    private static Random random = new Random();

    private static char[] generatedBigChars() {
        char[] generated = new char[5];

        for (int i = 0; i < MAX_BIG_CHARS; i++) {
            generated[i] = Characters.bigChars[random.nextInt(Characters.bigChars.length)];
        }
        return generated;
    }

    private static char[] generatedSmallChars() {
        char[] generated = new char[5];

        for (int i = 0; i < MAX_SMALL_CHARS; i++) {
            generated[i] = Characters.smallChars[random.nextInt(Characters.smallChars.length)];
        }
        return generated;
    }

    public static String generateUsername() {
        int totalLength = MAX_BIG_CHARS + MAX_SMALL_CHARS;
        String[] username = new String[totalLength];

        char[] bigChars = generatedBigChars();
        char[] smallChars = generatedSmallChars();
        int index = 0;

        for (char c : bigChars) {
            username[index++] = String.valueOf(c);
        }

        for (char c : smallChars) {
            username[index++] = String.valueOf(c);
        }

        StringBuilder generatedUsername = new StringBuilder();

        for (int i = 0; i < totalLength; i++) {
            int randomIndex = random.nextInt(username.length);
            generatedUsername.append(username[randomIndex]);

        }
        return generatedUsername.toString();
    }
}
