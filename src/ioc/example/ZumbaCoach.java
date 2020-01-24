package ioc.example;

public class ZumbaCoach implements ICoaching {

    private IAdviceService adviceService;

    public ZumbaCoach(){
        System.out.println("Zumba");
    }

    public void setAdviceService(IAdviceService adviceService){
        this.adviceService = adviceService;
    }

    @Override
    public String getWorkout() {
        return "Spin in circles until failure";
    }

    @Override
    public String getAdvice() {
        return this.adviceService.getAdvice();
    }
}
