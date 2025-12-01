package enzosdev.eventclean.infrastructure.presentation;

import enzosdev.eventclean.core.entities.Event;
import enzosdev.eventclean.core.usecases.CreateEventCase;
import enzosdev.eventclean.core.usecases.FindEventCase;
import enzosdev.eventclean.infrastructure.dtos.EventDTO;
import enzosdev.eventclean.infrastructure.mapper.EventMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class EventController {

    private final CreateEventCase createEventCase;
    private final EventMapper eventMapper;
    private final FindEventCase findEventCase;;

    public EventController(CreateEventCase createEventCase, EventMapper eventMapper, FindEventCase findEventCase) {
        this.createEventCase = createEventCase;
        this.eventMapper = eventMapper;
        this.findEventCase = findEventCase;
    }

    @PostMapping("createEvent")
    public EventDTO createEvent(@RequestBody EventDTO eventDTO){
        // no corpo da requsicao vai receber o dto que vai ser convertido para
        //entidade usando o mapper
        Event newEvent = createEventCase.execute(eventMapper.toEntity(eventDTO));
        // tem q devolver como EventDTO
        return eventMapper.toDto(newEvent);

    }


    @GetMapping("list")
    public List<EventDTO> eventList(EventDTO eventDTO){
        List<Event> eventDTOList =  findEventCase.execute(eventMapper.toEntity(eventDTO));
        return eventMapper.toDtoList(eventDTOList);
    }
}
