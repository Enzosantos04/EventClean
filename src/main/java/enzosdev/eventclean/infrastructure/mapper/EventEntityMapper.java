package enzosdev.eventclean.infrastructure.mapper;

import enzosdev.eventclean.core.entities.Event;
import enzosdev.eventclean.infrastructure.dtos.EventDTO;
import enzosdev.eventclean.infrastructure.persistence.EventEntity;
import org.springframework.stereotype.Component;

@Component
public class EventEntityMapper {

    public EventEntity toEntity(Event event){
        return  new EventEntity(
                event.id(),
                event.name(),
                event.description(),
                event.ticketIdentifier(),
                event.beginAt(),
                event.endAt(),
                event.capacity(),
                event.location(),
                event.eventOrganizer(),
                event.type()
        );
    }


    public Event toDomain(EventEntity eventEntity){
        return new Event(
                eventEntity.getId(),
                eventEntity.getName(),
                eventEntity.getDescription(),
                eventEntity.getTicketIdentifier(),
                eventEntity.getBeginAt(),
                eventEntity.getEndAt(),
                eventEntity.getCapacity(),
                eventEntity.getLocation(),
                eventEntity.getEventOrganizer(),
                eventEntity.getType()

        );
    }

}
