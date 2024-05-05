package guru.springframework.spring6webapp.Controller;

import guru.springframework.spring6webapp.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class propertyInkectedControllerTest {
    @Autowired
    propertyInkectedController propertyInkectedController ;
//    @BeforeEach
//    void setUp() {
//
//        propertyInkectedController = new propertyInkectedController();
//        propertyInkectedController.greetingService = new GreetingServiceImpl();
//    }
    @Test
    void sayHello() {
        System.out.println(propertyInkectedController.sayHello());

    }




}