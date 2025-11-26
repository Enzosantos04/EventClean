package enzosdev.eventclean.infrastructure.dtos;

import enzosdev.eventclean.core.enums.EventType;

import java.time.LocalDateTime;



public record EventDTO(
        Long id, String name,
        String description, String ticketIdentifier,
        LocalDateTime beginAt, LocalDateTime endAt,
        Integer capacity, String location, String eventOrganizer,
        EventType type
){}
