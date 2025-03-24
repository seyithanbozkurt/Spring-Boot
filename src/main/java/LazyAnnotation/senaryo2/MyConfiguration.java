package LazyAnnotation.senaryo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@Lazy
public class MyConfiguration {

    public MyConfiguration(){
        System.out.println("MyConfiguraiton bean initializied");
    }

    @Bean
   // @Lazy
    public Example1 getExample(){
        return new Example1();
    }

    @Bean
    public Example2 getExample2(){
        return new Example2();
    }
}
