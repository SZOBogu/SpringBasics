package basics.javaConfig.example;

import basics.common.IAdviceService;

public class CookingAdvice implements IAdviceService {

    @Override
    public String getAdvice() {
        return "Toasters and water don't go together well. Toasters, water and people even worse";
    }
}
