package enzosdev.eventclean.infrastructure.gateway;

import enzosdev.eventclean.core.entities.Event;
import enzosdev.eventclean.core.gateway.EventGateway;
import enzosdev.eventclean.infrastructure.mapper.EventEntityMapper;
import enzosdev.eventclean.infrastructure.mapper.EventMapper;
import enzosdev.eventclean.infrastructure.persistence.EventEntity;
import enzosdev.eventclean.infrastructure.persistence.EventRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

    @Override
    public List<Event> findEvents() {
       return eventRepository.findAll().stream()
                .map(eventEntityMapper::toDomain).collect(Collectors.toList());

    }

    @Override
    public boolean existsByIdentifier(String identifier) {
        return eventRepository.findAll().stream()
                .anyMatch(event -> event.getTicketIdentifier().equalsIgnoreCase(identifier));
    }

    @Override
    public Optional<Event> filterEventByIdentifier(String identifier) {
        return eventRepository.findByticketIdentifier(identifier);
    }
}
