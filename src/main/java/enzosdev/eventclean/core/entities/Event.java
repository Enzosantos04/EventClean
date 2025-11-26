package enzosdev.eventclean.core.entities;

import enzosdev.eventclean.core.enums.EventType;

import java.time.LocalDateTime;
import java.util.Date;

public record Event(Long id, String name,
                    String description, String ticketIdentifier,
                    LocalDateTime beginAt, LocalDateTime endAt,
                    Integer capacity, String location, String eventOrganizer,
                    EventType type) {

}
