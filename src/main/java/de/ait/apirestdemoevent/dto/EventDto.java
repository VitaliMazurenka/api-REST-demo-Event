package de.ait.apirestdemoevent.dto;

import de.ait.apirestdemoevent.entity.Event;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {
    private String name;
    private String description;
    private LocalDate date;

    // этот метод из полей события собирает нужные поля
    // возвращает объект типа EventDto

    public static EventDto from(Event event) {
        return new EventDto(event.getName(), event.getDescription(), event.getDate());

    }

    // этот метод собирает объекты типа EventDto в список, получая на вход список событий
    // со всеми их полями
    public List<EventDto> from(List<Event> events) {
        return events.stream()
                .map(EventDto::from)
                .collect(Collectors.toList());
    }


}
