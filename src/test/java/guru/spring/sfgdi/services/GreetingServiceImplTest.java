package guru.spring.sfgdi.services;

import guru.spring.sfgdi.controllers.PropertyInjectedController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreetingServiceImplTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.getGreeting());
    }
}