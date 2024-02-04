package de.ait.apirestdemoevent.service.impl;

import de.ait.apirestdemoevent.dto.EventDto;
import de.ait.apirestdemoevent.dto.NewEventDto;
import de.ait.apirestdemoevent.dto.UpdateEventDto;
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

    @Override
    public EventDto getEvent(Long id) {
        return from(eventRepository.findById(id));
    }

    @Override
    public EventDto updateEvent(Long id, UpdateEventDto updateEvent) {
        Event eventForUpdate = eventRepository.findById(id);
        eventForUpdate.setName(updateEvent.getName());
        eventForUpdate.setDescription(updateEvent.getDescription());
        eventForUpdate.setDate(updateEvent.getDate());

        return from(eventForUpdate);
    }

    @Override
    public EventDto deleteEvent(Long id) {
        // получаем Event по его id
        Event eventForDelete = eventRepository.findById(id);
        // удаляем
        eventRepository.deleteById(id);
        return from(eventForDelete);

    }


}
