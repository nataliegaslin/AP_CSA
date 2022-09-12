public class HotelMain {
  public static void main (String[] args){
    Person cecilia = new Person (5.1, 13, "Cecilia", "blonde");
    Person lux = new Person (5.6, 14, "Lux", "blonde");
    Person therese = new Person (5.2, 15, "Therese", "blonde");
    Person bonnie = new Person (5.7, 16, "Bonnie", "blonde");
    Person mary = new Person (5.8, 17, "Mary", "blonde");
    Person mrsLisbon = new Person (5.0, 67, "Mrs. Lisbon", "grey");
    HotelRoom room305 = new HotelRoom(305);
    ElderlySuite room306 = new ElderlySuite(306);
    HotelRoom room307 = new HotelRoom(307);
    HotelRoom room308 = new HotelRoom(308);
    room305.checkIn(cecilia);
    room305.checkIn(lux);
    room305.printGuestInfo();
    room305.checkIn(bonnie);
    room306.checkIn(therese);
    room306.checkIn(mary);
    room306.checkIn(mrsLisbon);
    room306.printGuestInfo();
    room307.checkIn(bonnie);
    room307.checkIn(therese);
    room307.printGuestInfo();
    room308.checkIn(mary);
    room308.printGuestInfo();

  }
}