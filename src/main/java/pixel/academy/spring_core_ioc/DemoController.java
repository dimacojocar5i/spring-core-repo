package pixel.academy.spring_core_ioc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Chef myChef;

    // constructor

    public DemoController(Chef theChef) {
        myChef = theChef;
    }

    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();
    }

}
