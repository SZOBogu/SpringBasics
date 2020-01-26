package AnnotationBasics;

import common.IAdviceService;
import org.springframework.stereotype.Component;

@Component
public class NotEvenAnAdvice implements IAdviceService {
    @Override
    public String getAdvice() {
        return "use only machines";
    }
}
