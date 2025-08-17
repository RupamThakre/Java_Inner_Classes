public class CarWithoutIC {
    private String model;
    private boolean isEngineOn;

    public CarWithoutIC(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

    public String getModel() {
        return model;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

}