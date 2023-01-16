package com.techreturners.exercise004;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise004Test {

    @Test
    public void checkGetDateTimeWhenDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19));
        LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);
        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);
        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 03, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }


    @Test
    public void checkGetDateTimeWhenStartDateIsALeapDay() {
        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2024, Month.FEBRUARY, 29, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2055, Month.NOVEMBER , 8, 1, 46, 39);
        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeThatShouldEndOnLeapDay() {
        Exercise004 ex004 = new Exercise004(LocalDateTime.of(1992, Month.JUNE, 22, 22, 13, 19, 0));
        LocalDateTime expected = LocalDateTime.of(2024, Month.FEBRUARY , 29, 23, 59, 59);
        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenStartDateIncludesNanoSecondsThenNanoSecondsStaySame() {
        Exercise004 ex004 = new Exercise004(LocalDateTime.of(1992, Month.JUNE, 22, 22, 13, 19, 545));
        LocalDateTime expected = LocalDateTime.of(2024, Month.FEBRUARY , 29, 23, 59, 59, 545);
        assertEquals(expected.getNano(), ex004.getDateTime().getNano());

    }
}
