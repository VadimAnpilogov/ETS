package petProject.ETS.EventInterface.service;

import petProject.ETS.EventInterface.model.Event;

import java.util.List;

public interface EventService {

    List<Event> findAllEvent();
    Event createEvent(Event event);
}
