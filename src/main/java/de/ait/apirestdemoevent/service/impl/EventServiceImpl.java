package de.ait.apirestdemoevent.service.impl;

import de.ait.apirestdemoevent.dto.EventDto;
import de.ait.apirestdemoevent.dto.NewEventDto;
import de.ait.apirestdemoevent.entity.Event;
import de.ait.apirestdemoevent.repository.EventRepository;
import de.ait.apirestdemoevent.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventRepository;
    @Override
    public List<EventDto> getAllEvents() {
        return null;
    }

    @Override
    public Event addEvent(NewEventDto newEvent) {
        return null;
    }
}
