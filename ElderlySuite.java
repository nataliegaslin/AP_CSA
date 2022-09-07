public class ElderlySuite extends HotelRoom {
    private int elderRoomNumber;
    private Person elderOne;
    private Person elderTwo;
   
    ElderlySuite(int eldRoomNum){
        elderRoomNumber = eldRoomNum;
    }
   //checks whether or not a person qualifies for the elderly suite
    public boolean isElderly(Person elder){
        if (elder.getAge() >= 60) {
            return true;
        }
        else if (elder.getAge() < 60) {
            return false;
        }
    }
    //checks in an elderly person
    public void elderCheckIn (Person elder){
        if (elder.isElderly() == true && checkCapacity() == 2){
            elderOne = elder;
            System.out.println(elder.getName() + " is checked into room " + elderRoomNumber + ", which is an elderly suite.");
        }
        else if (elder.isElderly() == true && elderOne == null && elderTwo != null){
            elderTwo = elder;
            System.out.println(elder.getName() + " is checked into room " + elderRoomNumber + ", which is an elderly suite.");
        }
        else if (elder.isElderly() == true && elderOne != null && elderTwo != null){
            elderOne = elder;
            System.out.println(elder.getName() + " is checked into room " + elderRoomNumber + ", which is an elderly suite.");
        }
        else if (elder.isElderly() == true && checkCapacity() == 0) {
            System.out.println("There is no more space in this room!");
        }
        else if (elder.isElderly() == false) {
            System.out.println(elder + " isn't eligible for this room!");
        else {
            System.out.println("There has been an error! Please call the front desk.");
        }
        }
    }
}