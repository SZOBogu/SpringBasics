package basics.common;

import org.springframework.stereotype.Component;

@Component
public class UnrelatedAdvice implements IAdviceService {
    @Override
    public String getAdvice() {
        return "don't drink and drive or somethin'";
    }
}
