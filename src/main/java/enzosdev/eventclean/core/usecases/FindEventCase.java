package enzosdev.eventclean.core.usecases;

import enzosdev.eventclean.core.entities.Event;

public interface FindEventCase {

    public Event execute(Event event);
}
