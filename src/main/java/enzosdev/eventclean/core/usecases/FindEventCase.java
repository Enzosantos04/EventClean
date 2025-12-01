package enzosdev.eventclean.core.usecases;

import enzosdev.eventclean.core.entities.Event;

import java.util.List;

public interface FindEventCase {

    public List<Event> execute(Event event);
}
