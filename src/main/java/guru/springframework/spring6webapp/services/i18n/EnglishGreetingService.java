package guru.springframework.spring6webapp.services.i18n;

import guru.springframework.spring6webapp.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")

@Service("i18NService")

public class EnglishGreetingService implements GreetingService {
    @Profile("EN")
        @Override
        public String sayGreeting() {
        return "Hello World - EN";
    }
}
