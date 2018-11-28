package sebaszczen.DependencyInjection1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class AlienPrototype {

    private String name;

    public AlienPrototype()
    {
        System.out.println("alien prototype created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
