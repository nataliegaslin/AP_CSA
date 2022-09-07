public class HotelRoom {
  private int roomNumber;
  private int sizeOfRoom;
  private Person guestOne;
  private Person guestTwo;

  HotelRoom(int roomNum){
    roomNumber = roomNum;
  }
  //checks in a guest to a specific room
  public void checkIn(Person guest) {
    if (checkCapacity() == 0) {
      System.out.println("There is no more space in this room!");
    }
    else if (checkCapacity() == 2) {
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
    if (checkCapacity() == 2) {
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
      return 2;
    }
    else if (guestOne != null && guestTwo == null) {
      return 1;
    }
    else if (guestOne == null && guestTwo != null){
      return 1;
    }
    else {
      return 0;
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
}