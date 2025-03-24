package LazyAnnotation.senaryo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App4 {
    public static void main(String[] args) {
        SpringApplication.run(App4.class, args);

        //İki tane component sınıfının birbirine ihtiyiaç duyduğu durumda
        //Dependecy ınjectıon da çıkan hata Lazy ile çözme
    }
}
