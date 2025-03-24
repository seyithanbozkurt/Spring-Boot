package LazyAnnotation.senaryo3;

import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyConttrooller {

    private MyComponent myComponent;

    public MyConttrooller(@Lazy MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    @GetMapping("/name")
    public String getComponentName(){
        return myComponent.getName();
    }
}
