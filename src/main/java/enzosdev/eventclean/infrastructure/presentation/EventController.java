package enzosdev.eventclean.infrastructure.presentation;

import enzosdev.eventclean.core.entities.Event;
import enzosdev.eventclean.core.usecases.CreateEventCase;
import enzosdev.eventclean.infrastructure.dtos.EventDTO;
import enzosdev.eventclean.infrastructure.mapper.EventMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class EventController {

    private final CreateEventCase createEventCase;
    private final EventMapper eventMapper;

    public EventController(CreateEventCase createEventCase, EventMapper eventMapper) {
        this.createEventCase = createEventCase;
        this.eventMapper = eventMapper;
    }

    @PostMapping("createEvent")
    public EventDTO createEvent(@RequestBody EventDTO eventDTO){
        // no corpo da requsicao vai receber o dto que vai ser convertido para
        //entidade usando o mapper
        Event newEvent = createEventCase.execute(eventMapper.toEntity(eventDTO));
        // tem q devolver como EventDTO
        return eventMapper.toDto(newEvent);

    }


    @GetMapping
    public String eventList(){
        return "Lista de eventos";
    }
}
