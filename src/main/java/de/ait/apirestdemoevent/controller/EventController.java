package de.ait.apirestdemoevent.controller;

import de.ait.apirestdemoevent.dto.EventDto;
import de.ait.apirestdemoevent.dto.NewEventDto;
import de.ait.apirestdemoevent.service.EventService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


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
}
