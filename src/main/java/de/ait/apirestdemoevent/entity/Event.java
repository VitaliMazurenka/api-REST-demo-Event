package de.ait.apirestdemoevent.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Event {
   private Long id;
   private String name;
   private String description;
   private LocalDate date;
}
