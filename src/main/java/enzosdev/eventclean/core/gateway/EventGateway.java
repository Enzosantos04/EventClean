package enzosdev.eventclean.core.gateway;

import enzosdev.eventclean.core.entities.Event;

public interface EventGateway {

    Event createEvent(Event event);
}
