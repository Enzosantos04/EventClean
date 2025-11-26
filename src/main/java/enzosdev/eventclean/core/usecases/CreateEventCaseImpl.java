package enzosdev.eventclean.core.usecases;

import enzosdev.eventclean.core.entities.Event;
import enzosdev.eventclean.core.gateway.EventGateway;



public class CreateEventCaseImpl implements CreateEventCase{


private final EventGateway eventGateway;
    public CreateEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(Event event) {
        return null;
    }
}
