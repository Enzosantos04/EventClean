package enzosdev.eventclean.infrastructure.persistence;

import enzosdev.eventclean.core.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventRepository extends JpaRepository<EventEntity, Long> {

    Optional<Event> findByticketIdentifier(String identifier);
}
