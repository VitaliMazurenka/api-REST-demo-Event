package de.ait.apirestdemoevent.controller;

import de.ait.apirestdemoevent.dto.EventDto;
import de.ait.apirestdemoevent.dto.NewEventDto;
import de.ait.apirestdemoevent.dto.UpdateEventDto;
import de.ait.apirestdemoevent.service.EventService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@AllArgsConstructor
public class EventController {
    private final EventService eventService;
    @Operation(summary = "Get all events", description = "For admin only ")
    @GetMapping("/events")
    @ResponseBody
    public List<EventDto> getAllUsers() {
        return eventService.getAllEvents();
    }

    @Operation(summary = "Add new event", description = "For Admin only")
    @PostMapping("/events")
    @ResponseBody
    public EventDto add(@RequestBody NewEventDto newEvent) {

        return eventService.addEvent(newEvent);
    }
    @Operation(summary = "Get one event by id", description = "Available for all")
    @GetMapping("/{event-id}")
    public EventDto getEventById(@Parameter(description = "event id", example = "3")
                               @PathVariable("event-id") Long id) {
        return eventService.getEvent(id);

    }
    @Operation(summary = "Delete event", description = "For Admin only")
    @DeleteMapping("/{event-id}")
    public EventDto deleteEvent(@Parameter(description = "event id", example = "2")
                              @PathVariable("event-id") Long id) {
        return eventService.deleteEvent(id);
    }
    @Operation(summary = "Update event", description = "For Admin only")
    @PutMapping("/{event-id}")
    public EventDto updateEvent(@Parameter(description = "event id", example = "1")
                              @PathVariable("event-id") Long id,
                              @RequestBody UpdateEventDto updateEvent) {
        return eventService.updateEvent(id, updateEvent);
    }
}
