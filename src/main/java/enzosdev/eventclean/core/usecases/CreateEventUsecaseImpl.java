package enzosdev.eventclean.core.usecases;

import enzosdev.eventclean.core.entities.Event;
import enzosdev.eventclean.core.gateway.EventGateway;
import enzosdev.eventclean.infrastructure.exceptions.DuplicateIdentifierException;


public class CreateEventUsecaseImpl implements CreateEventUsecase {


private final EventGateway eventGateway;
    public CreateEventUsecaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(Event event) {
        if (eventGateway.existsByIdentifier(event.ticketIdentifier())){
            throw new DuplicateIdentifierException("The ticket identifier: " + event.ticketIdentifier() + " already exists!");
        }

        return eventGateway.createEvent(event);
    }
}
