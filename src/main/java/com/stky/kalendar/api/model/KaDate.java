package com.stky.kalendar.api.model;

import java.time.LocalDate;
import java.util.Objects;

public class KaDate {
    private LocalDate startDate;
    private LocalDate endDate;

    public KaDate(LocalDate startDate){
        Objects.requireNonNull(startDate);
        this.startDate = startDate;
    }

    public KaDate(LocalDate startDate, LocalDate endDate){
        Objects.requireNonNull(startDate);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String toString(){
        if (endDate != null) {
            return startDate.toString() + " to " + endDate.toString();
        }
        return startDate.toString();
    }
}
