package de.ait.apirestdemoevent.repository.impl;

import de.ait.apirestdemoevent.entity.Event;
import de.ait.apirestdemoevent.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;


@Repository
@RequiredArgsConstructor
public class EventRepositoryImpl implements EventRepository {

    private final DataSource dataSource;  // DI
    @Override
    public void save(Event model) {

    }

    @Override
    public void delete(Event model) {

    }

    @Override
    public void update(Event model) {

    }

    @Override
    public List<Event> findAll() {
        return null;
    }

    @Override
    public Event findOneByName(String name) {
        return null;
    }
}
