package guru.springframework.spring6webapp.services;

public class PropertyGreetingService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Friends don't let friends to property injection!!!!";
    }

}
