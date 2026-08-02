package enzosdev.eventclean.infrastructure.presentation;

import enzosdev.eventclean.core.entities.Event;
import enzosdev.eventclean.core.usecases.CreateEventUsecase;
import enzosdev.eventclean.core.usecases.DeleteEventUsecase;
import enzosdev.eventclean.core.usecases.FilterEventIdentifierUsecase;
import enzosdev.eventclean.core.usecases.FindEventUsecase;
import enzosdev.eventclean.infrastructure.dtos.EventDTO;
import enzosdev.eventclean.infrastructure.mapper.EventMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1")
public class EventController {

    private final CreateEventUsecase createEventUsecase;
    private final EventMapper eventMapper;
    private final FindEventUsecase findEventUsecase;
    private final FilterEventIdentifierUsecase filterEventIdentifierUsecase;
    private final DeleteEventUsecase deleteEventUsecase;

    public EventController(CreateEventUsecase createEventUsecase, EventMapper eventMapper, FindEventUsecase findEventUsecase, FilterEventIdentifierUsecase filterEventIdentifierUsecase, DeleteEventUsecase deleteEventUsecase) {
        this.createEventUsecase = createEventUsecase;
        this.eventMapper = eventMapper;
        this.findEventUsecase = findEventUsecase;
        this.filterEventIdentifierUsecase = filterEventIdentifierUsecase;
        this.deleteEventUsecase = deleteEventUsecase;
    }

    @PostMapping("createEvent")
    public ResponseEntity<Map<String, Object>> createEvent(@RequestBody EventDTO eventDTO){
        // no corpo da requsicao vai receber o dto que vai ser convertido para
        //entidade usando o mapper
        Event newEvent = createEventUsecase.execute(eventMapper.toEntity(eventDTO));
        Map<String, Object> response = new HashMap<>();
        response.put("Message:", "Event registered with success!");
        response.put("Event data:", eventMapper.toDto(newEvent));
        return ResponseEntity.ok(response);

    }


    @GetMapping("list")
    public List<EventDTO> eventList(){
        return findEventUsecase.execute().stream()
                .map(eventMapper::toDto)
                .collect(Collectors.toList());
    }

@GetMapping("/TicketIdentifier/{identifier}")
    public ResponseEntity<Event> findByTicketIdentifier(@PathVariable String identifier){
        Event event = filterEventIdentifierUsecase.execute(identifier);
        return ResponseEntity.ok(event);
}

@DeleteMapping("/DeleteTicket/{identifier}")
    public ResponseEntity<?> deleteByTicketIdentifier(@PathVariable String identifier){
        deleteEventUsecase.execute(identifier);
        return ResponseEntity.ok().build();


}


}
