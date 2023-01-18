package com.techreturners.exercise001;

import java.util.*;

public class Exercise001 {
    public String capitalizeWord(String word) {
        var CapitalFirstLetter = word.substring(0, 1).toUpperCase();
        var restOfString = word.substring(1);
        return CapitalFirstLetter + restOfString;
    }

    public String generateInitials(String firstName, String lastName) {
        var firstInitial = firstName.substring(0, 1).toUpperCase();
        var lastInitial = lastName.substring(0, 1).toUpperCase();
        return String.format("%s.%s", firstInitial, lastInitial);
    }

    public double addVat(double originalPrice, double vatRate) {
        var vatIncreasedPrice = originalPrice * (vatRate / 100);
        var total = originalPrice + vatIncreasedPrice;
        var roundedTotal = Math.round(total * 100.0) / 100.0;
        return roundedTotal;
    }

    public String reverse(String sentence) {
        var stringBuilder = new StringBuilder(sentence);
        return stringBuilder.reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        var count = users.stream()
                .filter(user -> user.getType().equals("Linux"))
                .count();
        return Math.toIntExact(count);
    }
}
