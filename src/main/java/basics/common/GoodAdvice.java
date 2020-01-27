package basics.common;

import java.util.ArrayList;
import java.util.Random;

public class GoodAdvice implements IAdviceService {
    private ArrayList<String> adviceArray;

    public GoodAdvice(){
        this.adviceArray = new ArrayList<>();
        this.adviceArray.add("Eat big to get big");
        this.adviceArray.add("squatz & oatz = big gainz");
        this.adviceArray.add("4 scoops c'mon");
        this.adviceArray.add("do ss + gomad");
        this.adviceArray.add("leave humanity behind");
    }

    @Override
    public String getAdvice() {
        Random rand = new Random();
        return this.adviceArray.get(rand.nextInt(this.adviceArray.size()));
    }
}
