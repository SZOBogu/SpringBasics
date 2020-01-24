package ioc.example;

public class GoodAdvice implements IAdviceService {
    @Override
    public String getAdvice() {
        return "squatz & oatz = big gainz";
    }
}
