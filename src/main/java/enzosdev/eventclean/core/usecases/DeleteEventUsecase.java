package enzosdev.eventclean.core.usecases;

import enzosdev.eventclean.core.entities.Event;

public interface DeleteEventUsecase  {
    public void execute(String identifier);
}
