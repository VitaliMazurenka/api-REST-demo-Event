package de.ait.apirestdemoevent.service;


import de.ait.apirestdemoevent.dto.EventDto;
import de.ait.apirestdemoevent.dto.NewEventDto;
import de.ait.apirestdemoevent.dto.UpdateEventDto;
import de.ait.apirestdemoevent.entity.Event;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EventService {
    List<EventDto> getAllEvents();

    // сохранить всех пользователей

    EventDto addEvent(NewEventDto newEvent); // нужно все поля

    EventDto getEvent(Long id);
    EventDto updateEvent(Long id, UpdateEventDto updateEvent);

    EventDto deleteEvent(Long id);
}
