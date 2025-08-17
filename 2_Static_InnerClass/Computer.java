/*
* Inner member class is associated with instance of Outer class object
*
* Static inner class is associated with Outer class rather than its instance
* */

public class Computer {
    private String brand;
    private String model;

    private OperatingSystem os; //It is as part of Computer, therefore it should be associated with Computer

    //USB is different thing as it is not a part of the Computer -> not a part of any Instance of Computer -> there is no dependency on Computer ,so it could make static

    static class USB {
        private String type;

        public USB(String type) {
            this.type = type;
        }

        public void displayInfo(){
            System.out.println("USB Type: "+type);
        }
    }

    public OperatingSystem getOs() {
        return os;
    }

    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);
    }

    class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public void displayInfo(){
            System.out.println("Computer Model: "+model+ ", OS: "+osName);
        }
    }


}