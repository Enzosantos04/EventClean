package enzosdev.eventclean.core.entities;

import enzosdev.eventclean.core.enums.EventType;

import java.util.Date;

public record Event(Long id, String name,
                    String description, String ticketIdentifier,
                    Date beginAt, Date endAt,
                    Long capacity, String location, String eventOrganizer,
                    EventType type) {

}
