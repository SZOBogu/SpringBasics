package basics.common;

public class BadAdvice implements IAdviceService {

    @Override
    public String getAdvice() {
        return "skip facepulls tonight";
    }
}
