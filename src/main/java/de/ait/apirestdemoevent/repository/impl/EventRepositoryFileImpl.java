package de.ait.apirestdemoevent.repository.impl;

import de.ait.apirestdemoevent.entity.Event;
import de.ait.apirestdemoevent.repository.EventRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class EventRepositoryFileImpl implements EventRepository {

    public final String fileName;

    public EventRepositoryFileImpl(@Value("C:/Users/AIT TR Student/Desktop/api-REST-demo-Event/events.txt") String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Event> findAll() {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return reader.lines()
                    .map(line -> line.split(","))
                    .map(parsed -> new Event(parsed[0], parsed[1], LocalDate.parse(parsed[2])))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new IllegalStateException("Can't read the file" + e.getMessage());
        }

    }

    @Override
    public void save(Event event) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(event.getName() + "," + event.getDescription() + "," + event.getDate());
            writer.newLine();

        } catch (IOException e) {
            throw new IllegalStateException("Can't write to file: " + e.getMessage());
        }
    }

    @Override
    public void delete(Event model) {

    }

    @Override
    public void update(Event model) {

    }


    @Override
    public Event findOneByName(String name) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            return bufferedReader.lines()
                    .map(line -> line.split(","))
                    .filter(parsed -> parsed[0].equals(name))
                    .findFirst()
                    .map(parsed -> new Event(parsed[0], parsed[1], LocalDate.parse(parsed[2])))
                    .orElse(null);
        } catch (IOException e) {
            throw new IllegalStateException("Can't read file" + e.getMessage());
        }
    }
}
