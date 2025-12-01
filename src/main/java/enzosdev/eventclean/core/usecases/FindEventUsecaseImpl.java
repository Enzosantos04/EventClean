package enzosdev.eventclean.core.usecases;

import enzosdev.eventclean.core.entities.Event;
import enzosdev.eventclean.core.gateway.EventGateway;

import java.util.List;

public class FindEventUsecaseImpl implements FindEventUsecase {


    private final EventGateway eventGateway;

    public FindEventUsecaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public List<Event> execute(Event event) {
        return eventGateway.findEvents(event);
    }
}
