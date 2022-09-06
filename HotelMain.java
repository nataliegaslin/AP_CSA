public class HotelMain {
  public static void main (String[] args){
    Person natalie = new Person(5.35, 15, "Natalie", "brown");
    Person michael = new Person(5.75, 47, "Michael", "brown");
  HotelRoom one = new HotelRoom(1);
  System.out.println(one.checkCapacity());
  one.checkIn(natalie);
  one.printGuestInfo();
  one.checkOut(michael);
  }
}