package enzosdev.eventclean.infrastructure.presentation;

import enzosdev.eventclean.core.entities.Event;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class EventController {

    @PostMapping("")
    public String createEvent(@RequestBody Event event){
        return "Event Created";
    }
}
