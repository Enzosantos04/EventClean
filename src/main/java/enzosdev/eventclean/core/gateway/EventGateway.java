package enzosdev.eventclean.core.gateway;

import enzosdev.eventclean.core.entities.Event;

import java.util.List;

public interface EventGateway {

    Event createEvent(Event event);

    List<Event> findEvents(Event event);
}
