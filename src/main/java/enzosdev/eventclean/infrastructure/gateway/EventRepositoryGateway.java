package enzosdev.eventclean.infrastructure.gateway;

import enzosdev.eventclean.core.entities.Event;
import enzosdev.eventclean.core.gateway.EventGateway;
import enzosdev.eventclean.infrastructure.mapper.EventMapper;
import enzosdev.eventclean.infrastructure.persistence.EventRepository;
import org.springframework.stereotype.Component;

@Component
public class EventRepositoryGateway implements EventGateway {

    private final EventRepository eventRepository;

    public EventRepositoryGateway(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }
}
