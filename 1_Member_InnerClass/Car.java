
/*
* Requirement - with the help of Car Obejct , I could access the Engine Object
* Engine class would act like a member just like model and isEngineOn;
*
* sc. I crate one Car object and with the help of car object,
* i'm creating engine object, so that both engine and car object is related
*
* Inner class would behave as a member of Outer Class
* - with the help of outer class object, we instantiated inner class
* */

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    class Engine{

        void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model+ " engine started. ");
            }else {
                System.out.println(model+ " engine is already on ");
            }
        }

        void stop(){
            if(!isEngineOn){
                isEngineOn = false;
                System.out.println(model+ " engine stopped. ");
            }else{
                System.out.println(model+ " engine is already off");
            }
        }


    }

}