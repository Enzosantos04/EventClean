package enzosdev.eventclean.infrastructure.gateway;

import enzosdev.eventclean.core.entities.Event;
import enzosdev.eventclean.core.gateway.EventGateway;
import enzosdev.eventclean.infrastructure.mapper.EventEntityMapper;
import enzosdev.eventclean.infrastructure.persistence.EventEntity;
import enzosdev.eventclean.infrastructure.persistence.EventRepository;
import org.springframework.stereotype.Component;

@Component
public class EventRepositoryGateway implements EventGateway {

    private final EventRepository eventRepository;
    private final EventEntityMapper eventEntityMapper;

    public EventRepositoryGateway(EventRepository eventRepository, EventEntityMapper eventEntityMapper) {
        this.eventRepository = eventRepository;
        this.eventEntityMapper = eventEntityMapper;
    }

    @Override
    public Event createEvent(Event event) {
        //coverte Event para um EventEntity usando o mapper
        EventEntity entity = eventEntityMapper.toEntity(event);
        //salva usando instancia do EventRepository
        EventEntity newEvent = eventRepository.save(entity);
        //converte de volta  para Event
        return eventEntityMapper.toDomain(newEvent);
    }
}
