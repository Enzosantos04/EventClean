package enzosdev.eventclean.core.usecases;

import enzosdev.eventclean.core.entities.Event;

public interface CreateEventUsecase {

    //boa pratica usar nomeclatura mais simples para deixar implicito a chamada do usecase interface
    public Event execute(Event event);
}
