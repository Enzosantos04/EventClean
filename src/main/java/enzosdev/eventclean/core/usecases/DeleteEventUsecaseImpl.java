package enzosdev.eventclean.core.usecases;


import enzosdev.eventclean.core.gateway.EventGateway;
import enzosdev.eventclean.infrastructure.exceptions.NotFoundEventException;

public class DeleteEventUsecaseImpl implements DeleteEventUsecase {

    private EventGateway eventGateway;

    public DeleteEventUsecaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public void execute(String identifier) {
         eventGateway.deleteEventByIdentifier(identifier);
    }
}
