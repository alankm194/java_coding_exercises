package com.techreturners.exercise005;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise005 {
    private final static int ALPHABET_LETTER_COUNT = 26;
    public boolean isPangram(String input) {
        if (input.isEmpty()) {
            return false;
        }
        Set<Character> setOfChars = input.toLowerCase()
                .chars()
                .mapToObj(e -> (char) e)
                .filter(Character::isAlphabetic)
                .collect(Collectors.toSet());

        return setOfChars.size() == ALPHABET_LETTER_COUNT ? true : false;
    }

}
