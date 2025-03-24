package LazyAnnotation;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyyController {

    private MyComponnent myComponnent;

    public MyyController(MyComponnent myComponnent) {
        this.myComponnent = myComponnent;
    }
}
