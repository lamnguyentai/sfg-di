package guru.spring.sfgdi.controllers;

import guru.spring.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    public final GreetingService greetingService;

    public I18nController(@Qualifier("I18nService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
