package common;

public class ZumbaCoach implements ICoaching {

    private IAdviceService adviceService;
    private String email;
    private int bicepCircumference;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBicepCircumference(int bicepCircumference) {
        this.bicepCircumference = bicepCircumference;
    }

    public void setAdviceService(IAdviceService adviceService){
        this.adviceService = adviceService;
    }

    public IAdviceService getAdviceService() {
        return adviceService;
    }

    public String getEmail() {
        return email;
    }

    public int getBicepCircumference() {
        return bicepCircumference;
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
