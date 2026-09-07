package pixel.academy.spring_core_ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pixel.academy.spring_core_ioc.common.Chef;
import pixel.academy.spring_core_ioc.common.GreeckChef;

@Configuration
public class RestaurantConfig {

    @Bean
    public Chef greeckChef() {
        return new GreeckChef();
    }


}
