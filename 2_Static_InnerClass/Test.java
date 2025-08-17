public class Test {
    public static void main(String... args){

        Computer computer = new Computer("HP","ABC","XYZ");

//        computer.new OperatingSystem(); -> private access not able to create the object as it is private class

        //Here -> operating sytem object is associated with Computer
        computer.getOs().displayInfo();

        /*
        * When Computer instance got created -> automatically OperatingSystem instance would also created
        *
        * But there will be no instance created everytime for static class -> saves the memory!.
        *
        * I created static class inside Computer -> just to keep everything together at one place -> tommarow I could
        * create CD class, PenDrive class
        *
        * */
        Computer.USB usb = new Computer.USB("TYPE-C");
        usb.displayInfo();

    }
}