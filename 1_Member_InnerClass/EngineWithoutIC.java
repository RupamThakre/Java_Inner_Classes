public class EngineWithoutIC{

    public CarWithoutIC car;

    public EngineWithoutIC(CarWithoutIC car){
        this.car = car;
    }

    public void start(){
        if(!car.isEngineOn()){
            car.setEngineOn(true);
            System.out.println(car.getModel()+ " engine started.");
        }else{
            System.out.println(car.getModel()+ " engine is already on.");
        }
    }

    public void stop(){
        if(!car.isEngineOn()){
            car.setEngineOn(false);
            System.out.println(car.getModel()+ " engine stopped. ");
        }else{
            System.out.println(car.getModel()+ " engine is already off");
        }
    }
}