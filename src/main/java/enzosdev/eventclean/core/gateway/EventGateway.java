package enzosdev.eventclean.core.gateway;

import enzosdev.eventclean.core.entities.Event;

import java.util.List;
import java.util.Optional;

public interface EventGateway {

    Event createEvent(Event event);

    List<Event> findEvents();

    boolean existsByIdentifier(String identifier);

    Optional<Event> filterEventByIdentifier(String identifier);
}
