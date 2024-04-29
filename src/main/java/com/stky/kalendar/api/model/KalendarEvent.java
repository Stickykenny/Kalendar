package com.stky.kalendar.api.model;

import java.time.LocalDate;

public class KalendarEvent {
    private KaDate kaDate;

    public KalendarEvent(){
        this.kaDate = new KaDate(LocalDate.now());
    }

    public String toString(){
        return kaDate.toString();
    }
}
