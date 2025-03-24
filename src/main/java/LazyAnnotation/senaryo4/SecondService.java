package LazyAnnotation.senaryo4;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
public class SecondService {
    private FirstService firstService;

    public SecondService(@Lazy FirstService firstService) {//First a ihtiyaç duyulduğunda ınjectıon yap
        this.firstService = firstService;
    }
}
