package de.ait.apirestdemoevent.repository;

import de.ait.apirestdemoevent.entity.Event;

public interface EventRepository extends CrudRepository<Event>{
    Event findOneByName(String name);

}
