package enzosdev.eventclean.infrastructure.mapper;


import enzosdev.eventclean.core.entities.Event;
import enzosdev.eventclean.infrastructure.dtos.EventDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventMapper {

    public EventDTO toDto(Event event){
        return  new EventDTO(
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

  public Event toEntity(EventDTO eventDTO){
        return new Event(
                eventDTO.id(),
                eventDTO.name(),
                eventDTO.description(),
                eventDTO.ticketIdentifier(),
                eventDTO.beginAt(),
                eventDTO.endAt(),
                eventDTO.capacity(),
                eventDTO.location(),
                eventDTO.eventOrganizer(),
                eventDTO.type()
        );
  }

}
