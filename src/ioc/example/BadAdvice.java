package ioc.example;

public class BadAdvice implements IAdviceService {

    @Override
    public String getAdvice() {
        return "skip facepulls tonight";
    }
}
