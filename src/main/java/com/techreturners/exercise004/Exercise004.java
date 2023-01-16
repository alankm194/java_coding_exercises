package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    private LocalDateTime localDateTime;
    private static final int GIGA_SECOND = 1000000000;
    public Exercise004(LocalDate date) {
        this.localDateTime = date.atStartOfDay().plusSeconds(GIGA_SECOND);
    }

    public Exercise004(LocalDateTime dateTime) {
        this.localDateTime = dateTime.plusSeconds(GIGA_SECOND);
    }

    public LocalDateTime getDateTime() {
        return localDateTime;
    }
}
