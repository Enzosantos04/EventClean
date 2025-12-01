package enzosdev.eventclean.core.usecases;

import enzosdev.eventclean.core.entities.Event;
import enzosdev.eventclean.core.gateway.EventGateway;

import java.util.List;

public class FindEventCaseImpl implements FindEventCase {


    private final EventGateway eventGateway;

    public FindEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public List<Event> execute(Event event) {
        return eventGateway.findEvents(event);
    }
}
