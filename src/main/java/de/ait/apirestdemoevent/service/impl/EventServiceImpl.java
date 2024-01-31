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

import static de.ait.apirestdemoevent.dto.EventDto.from;

@RequiredArgsConstructor
@Service

public class EventServiceImpl implements EventService {

    @Autowired
    EventRepository eventRepository;


    @Override
    public List<EventDto> getAllEvents() {
        return from(eventRepository.findAll());
    }

    @Override
    public EventDto addEvent(NewEventDto newEvent) {
        Event event = Event.builder()
                .name(newEvent.getName())
                .description(newEvent.getDescription())
                .date(newEvent.getDate())
                .build();
        eventRepository.save(event);
        return from(event);
    }
}
