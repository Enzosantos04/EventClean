package enzosdev.eventclean.infrastructure.dtos;

import enzosdev.eventclean.core.enums.EventType;
import java.util.Date;


public record EventDTO(
        Long id, String name,
        String description, String ticketIdentifier,
        Date beginAt, Date endAt,
        Integer capacity, String location, String eventOrganizer,
        EventType type
){}
