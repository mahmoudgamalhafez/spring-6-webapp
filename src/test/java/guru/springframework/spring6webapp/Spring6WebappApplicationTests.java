package guru.springframework.spring6webapp;

import guru.springframework.spring6webapp.Controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6WebappApplicationTests {
    @Autowired
    ApplicationContext applicationContext ;
    @Autowired
    MyController myController;

    @Test
    void testAutowireOfController(){
        System.out.println(myController.sayHello());
    }


    @Test
    void testGetControllerFromCtx() {
        MyController myController = applicationContext.getBean(MyController.class);

        System.out.println(myController.sayHello());
    }

    @Test
    void contextLoads() {
    }

}
