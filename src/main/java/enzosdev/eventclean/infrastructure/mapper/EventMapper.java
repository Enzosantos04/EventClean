package enzosdev.eventclean.infrastructure.mapper;


import enzosdev.eventclean.infrastructure.dtos.EventDTO;
import enzosdev.eventclean.infrastructure.persistence.EventEntity;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {

    public EventEntity map(EventDTO dto){
        EventEntity eventEntity = new EventEntity();
        eventEntity.setId(dto.getId());
        eventEntity.setName(dto.getName());
        eventEntity.setDescription(dto.getDescription());
        eventEntity.setTicketIdentifier(dto.getTicketIdentifier());
        eventEntity.setBeginAt(dto.getBeginAt());
        eventEntity.setEndAt(dto.getEndAt());
        eventEntity.setCapacity(dto.getCapacity());
        eventEntity.setLocation(dto.getLocation());
        eventEntity.setEventOrganizer(dto.getEventOrganizer());
        eventEntity.setType(dto.getType());

        return eventEntity;
    }


    public EventDTO map(EventEntity event){
        EventDTO eventDTO = new EventDTO();
        eventDTO.setId(event.getId());
        eventDTO.setName(event.getName());
        eventDTO.setDescription(event.getDescription());
        eventDTO.setTicketIdentifier(event.getTicketIdentifier());
        eventDTO.setBeginAt(event.getBeginAt());
        eventDTO.setEndAt(event.getEndAt());
        eventDTO.setCapacity(event.getCapacity());
        eventDTO.setLocation(event.getLocation());
        eventDTO.setEventOrganizer(event.getEventOrganizer());
        eventDTO.setType(event.getType());

        return eventDTO;
    }

}
