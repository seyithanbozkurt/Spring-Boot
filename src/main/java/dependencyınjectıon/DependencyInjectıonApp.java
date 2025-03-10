package dependencyınjectıon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class DependencyInjectıonApp {

    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectıonApp.class, args);
    }

    @Bean
    public SecondClas getSecondClas(){
        return new SecondClas();
    }
}
