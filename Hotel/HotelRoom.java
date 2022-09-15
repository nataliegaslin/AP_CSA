public class HotelRoom {
  public int roomNumber;
  public int sizeOfRoom;
  public Person guestOne;
  public Person guestTwo;

  HotelRoom(int roomNum){
    roomNumber = roomNum;
  }
 // constructor for larger/smaller rooms that 2 (must enter a positive number for roomSize)
  HotelRoom(int roomNum, int roomSize) {
      roomNumber = roomNum;
      sizeOfRoom = roomSize;
      if (sizeOfRoom >  5) {
        tooMany();
        sizeOfRoom = 5;
      }
      else {
        roomSizeMessage();
      }
                        
  }

  //checks in a guest to a specific room
  public void checkIn(Person guest) {
    if (checkCapacity() == 2) {
      System.out.println("There is no more space in this room for " + guest.getName() + "!");
    }
    else if (checkCapacity() == 1) {
      guestOne = guest;
      System.out.println(guest.getName() + " is checked into room " + roomNumber + ".");
    }
    else if (guestOne == null && guestTwo != null) {
      guestOne = guest;
      System.out.println(guest.getName() + " is checked into room " + roomNumber + ".");
    }
    else {
      guestTwo = guest;
      System.out.println(guest.getName() + " is checked into room " + roomNumber + ".");
    }
  }
    // removes a guest from a room
  public void checkOut(Person guest) {
    if (checkCapacity() == 0) {
      System.out.println("There are no people in this room!");
    }
    else if (guestOne == null && guest.matches(guestTwo)) {
      guestTwo = null;
      System.out.println(guest.getName() + " just checked out of room " + roomNumber + ".");
    }
    else if (guestOne != null && guestTwo != null && guest.matches(guestOne) == false && guest.matches(guestTwo) == false) {
      System.out.println(guest.getName() + " isn't in this room!");
    }
    else if (guestTwo == null && guest.matches(guestOne)) {
      guestOne= null;
      System.out.println(guest.getName() + " just checked out of room " + roomNumber + ".");
    }
    else if (guestOne == null && guest.matches(guestTwo) == false) {
      System.out.println(guest.getName() + " isn't in this room!");
    }
    else if (guestTwo == null && guest.matches(guestOne) == false) {
      System.out.println(guest.getName() + " isn't in this room!");
    }
    else if (guestTwo != null && guestOne !=null && guest.matches(guestOne)) {
    guestOne = null;
    System.out.println(guest.getName() + " just checked out of room " + roomNumber + ".");
    }
    else if (guestOne != null && guestTwo !=null && guest.matches(guestTwo)) {
      guestTwo = null;
      System.out.println(guest.getName() + " just checked out of room " + roomNumber + ".");
    }
  }
  // checks the capacity of a room
  public int checkCapacity(){
    if (guestOne == null && guestTwo == null){
      return 0;
    }
    else if (guestOne != null && guestTwo == null) {
      return 1;
    }
    else if (guestOne == null && guestTwo != null){
      return 1;
    }
    else {
      return 2;
    }
  }
  // prints out the guests' age, name, hair color, and height in a given room
  public void printGuestInfo(){
    if (guestOne != null && guestTwo == null) {
      System.out.println(guestOne);
  }
    else if (guestTwo != null && guestOne == null) {
      System.out.println(guestTwo);
    }
    else if (guestTwo != null && guestOne != null){
      System.out.println(guestOne);
      System.out.println(guestTwo);
    }
    else {
      System.out.println("There are no guests in this room!");
    }
}

// tells people if the roomSize is set to too many people
public void tooMany(){
  System.out.println("We don't have any rooms that big! We will offer you a 5 person room instead.");

}
// prints out how big a given room is
public void roomSizeMessage(){
  System.out.println("This room can fit " + sizeOfRoom + " people!");
}
}

