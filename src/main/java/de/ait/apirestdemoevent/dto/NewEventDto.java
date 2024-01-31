package de.ait.apirestdemoevent.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "New event", description = "How to add new event")
public class NewEventDto {
    @Schema(name = "Event name", example = "Independence day")
    private String name;
    @Schema(name = "Event description", description = "Governmental")
    private String description;
    @Schema(name = "Event date", example = "2024-04-07")
    private LocalDate date;
}