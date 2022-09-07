public class HotelMain {
  public static void main (String[] args){
    Person natalie = new Person(5.35, 15, "Natalie", "brown");
    Person michael = new Person(5.75, 47, "Michael", "brown");
    Person lia = new Person (4.0, 67, "Lia", "black");
  HotelRoom one = new HotelRoom(1);
  ElderlySuite three = new ElderlySuite(3);
  one.checkIn(natalie);
  one.printGuestInfo();
  one.checkOut(michael);
  one.checkIn(lia);
  one.printGuestInfo();
  three.elderCheckIn(lia);
  }
}