package de.ait.apirestdemoevent.service;


import de.ait.apirestdemoevent.dto.EventDto;
import de.ait.apirestdemoevent.dto.NewEventDto;
import de.ait.apirestdemoevent.entity.Event;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EventService {
    List<EventDto> getAllEvents();
    EventDto addEvent(NewEventDto newEvent);
}
