package enzosdev.eventclean.infrastructure.beans;

import enzosdev.eventclean.core.gateway.EventGateway;
import enzosdev.eventclean.core.usecases.CreateEventCase;
import enzosdev.eventclean.core.usecases.CreateEventCaseImpl;
import enzosdev.eventclean.core.usecases.FindEventCase;
import enzosdev.eventclean.core.usecases.FindEventCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CreateEventCase createEventCase(EventGateway eventGateway){
        return new CreateEventCaseImpl(eventGateway);

    }


    @Bean
    public FindEventCase findEventCase(EventGateway eventGateway){
        return new FindEventCaseImpl(eventGateway);
    }
}
