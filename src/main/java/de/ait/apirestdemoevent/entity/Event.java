package de.ait.apirestdemoevent.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Event {
   private String name;
   private String description;
   private LocalDate date;
}
