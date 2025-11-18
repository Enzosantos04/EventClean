package enzosdev.eventclean.infrastructure.persistence;
import enzosdev.eventclean.core.enums.EventType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "Events")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EventEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private String description;
    private String ticketIdentifier;
    private LocalDateTime beginAt;
    private LocalDateTime endAt;
    private Integer capacity;
    private String location;
    private String eventOrganizer;
    @Enumerated(EnumType.STRING)
    private EventType type;
}
