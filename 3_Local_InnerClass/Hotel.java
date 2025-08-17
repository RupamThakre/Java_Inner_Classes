public class Hotel {

    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.reservedRooms = reservedRooms;
        this.totalRooms = totalRooms;
    }

    public void reserveRoom(String guestName, int numOfRooms){

        /*
        * Local inner class
        * - want to encapsulate validation logic inside a class
        * - as we dont want to use ReservationValidator class anywhere else
        * - then why you don't want to keep it here only.
        *
        * validate() method can enclose upper class member variables
        *
        * */

        class ReservationValidator {
            boolean validate(){
                if(guestName == null || guestName.isBlank()){
                    System.out.println("Guest name can not be empty !");
                    return false;
                }
                if(numOfRooms < 0){
                    System.out.println("Number of rooms should be positive ");
                    return false;
                }
                if(reservedRooms + numOfRooms > totalRooms){
                    System.out.println("Not enough rooms available");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();
        if(validator.validate()){
            reservedRooms+= numOfRooms;
            System.out.println("Reservation confirmed for "+guestName+ " for "+numOfRooms);
        }else{
            System.out.println("Reservation failed");
        }

    }
}