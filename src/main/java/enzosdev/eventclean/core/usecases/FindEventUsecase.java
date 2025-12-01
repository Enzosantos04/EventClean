package enzosdev.eventclean.core.usecases;

import enzosdev.eventclean.core.entities.Event;

import java.util.List;

public interface FindEventUsecase {

    public List<Event> execute();
}
