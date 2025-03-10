package InjectıonYontemleri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyContttroller {
    /*
    Injectıon Yontemleri

        Filed Injection
        Setter Injectıon
        Constructor Injectıon
     */

    //Filed Injectıon
   // @Autowired
    //private ClassOne classOne;

    private ClassOne classOne;
    private ClassTwo classTwo;

    private ClassThrid classThrid;

    //Setter Injectıon
    @Autowired
    public void setClassTwo(ClassTwo classTwo) {
        this.classTwo = classTwo;
    }

    //Constructor Injectıon
    public MyContttroller(ClassThrid classThrid) {
        this.classThrid = classThrid;
    }

    @Autowired
    public MyContttroller(@Qualifier("classOne") ClassOne classOne, ClassThrid classThrid) {
        this.classOne = classOne;
        this.classThrid = classThrid;
    }

    @GetMapping("/names")
    public String getNameOfClasses(){
        return this.classOne.getname() + " - " + this.classTwo.getname() + " - " + this.classThrid.getname();
    }
}
