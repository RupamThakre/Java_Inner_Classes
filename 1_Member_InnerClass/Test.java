
public class Test{

    public static void main(String... args){
        Car car1 = new Car("Tata Safari");
        Car.Engine engine1 = car1.new Engine();

        engine1.start();
        engine1.stop();

        CarWithoutIC car2 = new CarWithoutIC("Fronx");
        EngineWithoutIC engine2 = new EngineWithoutIC(car2);

        engine2.start();
        engine2.stop();

    }

}