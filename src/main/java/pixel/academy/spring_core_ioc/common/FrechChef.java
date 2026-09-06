package pixel.academy.spring_core_ioc.common;

import org.springframework.stereotype.Component;

@Component
public class FrechChef implements Chef {

    @Override
    public String getDailyRecipe() {
        return "Preparez un Beuf Bourguignon avec vin rouge et herbes";
    }

    public FrechChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
}
