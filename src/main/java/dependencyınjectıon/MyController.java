package dependencyınjectıon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class MyController {

    @Autowired
    private FirstClas firstClas;

    @Autowired
    private SecondClas secondClas;

    @GetMapping("/first-class")
    public String getNameOfFirstClass(){
        return firstClas.getName();
    }

    @GetMapping("/second-class")
    public String getNameOfSecondClass(){
        return secondClas.getName();
    }
}
