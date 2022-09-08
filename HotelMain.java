public class HotelMain {
  public static void main (String[] args){
    Person cecilia = new Person (5.2, 13, "Cecilia", "brown");
    HotelRoom seven = new HotelRoom(7);
    ElderlySuite eight = new ElderlySuite(8);
    seven.checkIn(cecilia);
    seven.printGuestInfo();
    seven.checkOut(cecilia);
    eight.checkIn(cecilia);

  }
}