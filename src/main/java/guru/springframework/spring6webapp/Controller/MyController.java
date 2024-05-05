package guru.springframework.spring6webapp.Controller;

import guru.springframework.spring6webapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    GreetingService greetingService ;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public MyController() {

    }

    public String sayHello(){
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }
}