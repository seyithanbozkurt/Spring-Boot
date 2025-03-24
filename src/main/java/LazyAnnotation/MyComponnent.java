package LazyAnnotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MyComponnent {
    public MyComponnent(){
        System.out.println("MyComponennt bean initiliazed");
    }
}
