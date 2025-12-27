package enzosdev.eventclean.core.usecases;

import enzosdev.eventclean.core.entities.Event;
import enzosdev.eventclean.core.gateway.EventGateway;
import enzosdev.eventclean.infrastructure.exceptions.NotFoundEventException;

public class FilterEventIdentifierUsecaseImpl implements FilterEventIdentifierUsecase{

    private final EventGateway eventGateway;

    public FilterEventIdentifierUsecaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(String identifier) {
        return eventGateway.filterEventByIdentifier(identifier)
                .orElseThrow(() -> new NotFoundEventException("Event of identifier " + identifier + " not found."));
    }
}
