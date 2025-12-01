package enzosdev.eventclean.infrastructure.presentation;

import enzosdev.eventclean.core.entities.Event;
import enzosdev.eventclean.core.usecases.CreateEventUsecase;
import enzosdev.eventclean.core.usecases.FindEventUsecase;
import enzosdev.eventclean.infrastructure.dtos.EventDTO;
import enzosdev.eventclean.infrastructure.mapper.EventMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1")
public class EventController {

    private final CreateEventUsecase createEventUsecase;
    private final EventMapper eventMapper;
    private final FindEventUsecase findEventUsecase;

    public EventController(CreateEventUsecase createEventUsecase, EventMapper eventMapper, FindEventUsecase findEventUsecase) {
        this.createEventUsecase = createEventUsecase;
        this.eventMapper = eventMapper;
        this.findEventUsecase = findEventUsecase;
    }

    @PostMapping("createEvent")
    public EventDTO createEvent(@RequestBody EventDTO eventDTO){
        // no corpo da requsicao vai receber o dto que vai ser convertido para
        //entidade usando o mapper
        Event newEvent = createEventUsecase.execute(eventMapper.toEntity(eventDTO));
        // tem q devolver como EventDTO
        return eventMapper.toDto(newEvent);

    }


    @GetMapping("list")
    public List<EventDTO> eventList(){
        return findEventUsecase.execute().stream()
                .map(eventMapper::toDto)
                .collect(Collectors.toList());
    }
}
