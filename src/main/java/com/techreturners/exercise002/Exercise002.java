package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        if ("manchester".equals(person.getLocation().toLowerCase())) {
            return true;
        }
        return false;
    }

    public boolean canWatchFilm(Person person, int ageLimit) {
        if (person.getAge() >= 18) {
            return true;
        }
        return false;
    }

}
