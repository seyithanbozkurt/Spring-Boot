package LazyAnnotation.senaryo4;

import org.springframework.stereotype.Service;

@Service
public class FirstService {
    private SecondService secondService;

    public FirstService(SecondService secondService) {
        this.secondService = secondService;
    }
}
