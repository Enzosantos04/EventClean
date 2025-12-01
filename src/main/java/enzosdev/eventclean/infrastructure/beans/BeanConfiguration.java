package enzosdev.eventclean.infrastructure.beans;

import enzosdev.eventclean.core.gateway.EventGateway;
import enzosdev.eventclean.core.usecases.CreateEventUsecase;
import enzosdev.eventclean.core.usecases.CreateEventUsecaseImpl;
import enzosdev.eventclean.core.usecases.FindEventUsecase;
import enzosdev.eventclean.core.usecases.FindEventUsecaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateEventUsecase createEventCase(EventGateway eventGateway){
        return new CreateEventUsecaseImpl(eventGateway);

    }


    @Bean
    public FindEventUsecase findEventCase(EventGateway eventGateway){
        return new FindEventUsecaseImpl(eventGateway);
    }
}
