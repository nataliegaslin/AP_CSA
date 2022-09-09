public class HotelMain {
  public static void main (String[] args){
    Person cecilia = new Person (5.2, 13, "Cecilia", "brown");
    Person lux = new Person (6.0, 17, "Lux", "blonde");
    Person bonnie = new Person (5.7, 15, "Bonnie", "blonde");
    Person rose = new Person (5.0, 67, "Rose", "grey");
    HotelRoom seven = new HotelRoom(7);
    ElderlySuite eight = new ElderlySuite(8);
    seven.checkIn(cecilia);
    seven.checkIn(lux);
    seven.printGuestInfo();
    seven.checkIn(bonnie);
    seven.checkOut(cecilia);
    eight.checkIn(cecilia);
    eight.checkIn(rose);
    eight.printGuestInfo();

  }
}