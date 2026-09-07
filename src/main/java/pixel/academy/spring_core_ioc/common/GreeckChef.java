package pixel.academy.spring_core_ioc.common;

public class GreeckChef implements Chef {

    // constructor
    public GreeckChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Greeck Salad - A fresh and healty mix of tomatoes,cucumbers, red onions, olives and feta chese. ";
    }
}
