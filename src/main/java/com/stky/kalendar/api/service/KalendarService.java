package com.stky.kalendar.api.service;

import com.stky.kalendar.api.model.KalendarEvent;
import org.springframework.stereotype.Service;

@Service
public class KalendarService {

    public KalendarEvent getEvent(Integer id) {
        return new KalendarEvent();
    }

}
