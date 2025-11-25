package enzosdev.eventclean.infrastructure.dtos;

import enzosdev.eventclean.core.enums.EventType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDTO {
    private Long id;
    private String name;
    private String description;
    private String ticketIdentifier;
    private LocalDateTime beginAt;
    private LocalDateTime endAt;
    private Integer capacity;
    private String location;
    private String eventOrganizer;
    private EventType type;

}
