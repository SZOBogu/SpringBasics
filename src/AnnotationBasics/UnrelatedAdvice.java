package AnnotationBasics;

import org.springframework.stereotype.Component;

@Component
public class UnrelatedAdvice implements common.IAdviceService {
    @Override
    public String getAdvice() {
        return "don't drink and drive or somethin'";
    }
}
