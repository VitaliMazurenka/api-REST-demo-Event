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
@Schema(name="Update event", description = "Fields for update")

public class UpdateEventDto {
    private String name;
    private String description;
    private LocalDate date;
}
