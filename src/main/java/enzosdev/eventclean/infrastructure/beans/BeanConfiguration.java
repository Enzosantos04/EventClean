package enzosdev.eventclean.infrastructure.beans;

import enzosdev.eventclean.core.gateway.EventGateway;
import enzosdev.eventclean.core.usecases.CreateEventCase;
import enzosdev.eventclean.core.usecases.CreateEventCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateEventCase createEventCase(EventGateway eventGateway){
        return new CreateEventCaseImpl(eventGateway);

    }
}
