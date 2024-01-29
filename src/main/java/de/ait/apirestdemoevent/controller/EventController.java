package de.ait.apirestdemoevent.controller;

import de.ait.apirestdemoevent.dto.EventDto;
import de.ait.apirestdemoevent.dto.NewEventDto;
import de.ait.apirestdemoevent.service.EventService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class EventController {
    private final EventService eventService;
    // методы для работы с пользователем (mvc)
//
    @PostMapping("/register")
    public String addEvent(NewEventDto newEvent){
        eventService.addEvent(newEvent);
        return "redirect:/success_page.html";
    }

    @GetMapping("/home")
    public String getHomePage(Model model){
        return "redirect:home.html";
    }
    //
    @GetMapping("/events")
    public String getEventsPage(Model model){
        List<EventDto> events = eventService.getAllEvents();
        model.addAttribute("eventList", events); // связываем данные и их представление в шаблонизаторе
        return "events_page";
    }
}
