package de.ait.apirestdemoevent.service;


import de.ait.apirestdemoevent.dto.EventDto;
import de.ait.apirestdemoevent.dto.NewEventDto;
import de.ait.apirestdemoevent.entity.Event;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EventService {
    List<EventDto> getAllEvents();
    Event addEvent(NewEventDto newEvent);
}
