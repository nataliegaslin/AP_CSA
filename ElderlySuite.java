public class ElderlySuite extends HotelRoom {
    Person guest;

    ElderlySuite(int roomNum){
        super(roomNum);
    }
  
    //checks in an elderly person using the checkIn method from HotelRoom
    public void checkIn (Person guest){
        if (guest.isElderly(guest) == true) {
            super.checkIn(guest);
        }
        else {
            System.out.println (guest.getName() + " isn't eligible to stay in this room!");
        }
    }
}