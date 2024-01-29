package de.ait.apirestdemoevent.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewEventDto {
    private String name;
    private String description;
    private LocalDate date;
}
