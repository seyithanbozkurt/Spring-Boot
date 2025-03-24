package LazyAnnotation.senaryo3;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//ınjectıon yapıldığında tetiklenir
@Component
@Lazy
public class MyComponent {
    public MyComponent(){
        System.out.println("MyComponent bean initiliazed");
    }

    public String getName(){
        return "MyComponent";
    }
}
