package guru.spring.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("JP")
@Service("I18nService")
public class I18JapanGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "こんにちは！";
    }
}
