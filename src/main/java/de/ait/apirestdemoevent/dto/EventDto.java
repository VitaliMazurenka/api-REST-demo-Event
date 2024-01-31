package de.ait.apirestdemoevent.dto;

import de.ait.apirestdemoevent.entity.Event;
import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(name = "Event", description = "Event info")
public class EventDto {
    @Schema(name = "Event", example = "Christmas")
    private String name;
    @Schema(name = "description", description = "Religious")
    private String description;
    @Schema(name = "date", example = "2024-25-12")
    private LocalDate date;

    // этот метод из полей события собирает нужные поля
    // возвращает объект типа EventDto

    public static EventDto from(Event event) {
        return new EventDto(event.getName(), event.getDescription(), event.getDate());

    }

    // этот метод собирает объекты типа EventDto в список, получая на вход список событий
    // со всеми их полями
    public static List<EventDto> from(List<Event> events) {
        return events.stream()
                .map(EventDto::from)
                .collect(Collectors.toList());
    }
}
