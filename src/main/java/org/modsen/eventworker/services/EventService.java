package org.modsen.eventworker.services;

import org.modsen.eventworker.dao.pojo.Event;
import org.modsen.eventworker.services.sorting.enums.SortingMethod;

import java.util.List;

public interface EventService {
    List<Event> findAllEvents(SortingMethod... sortingParameters);
    Event findEventById(long id);
    void registerEvent(Event event);
    void changeEvent(Event event);
    void deleteEvent(Event event);
}
