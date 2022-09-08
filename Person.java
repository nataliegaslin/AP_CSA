public class Person {
  public double height;
  public int age;
  public String name;
  public String hairColor;

  Person(double h, int a, String n, String hC) {
    height = h;
    age = a;
    name = n;
    hairColor = hC;
  }
  // returns the guests' info
  public String toString() {
    return ("Guest info: Name: " + name + "   Height: " + height + "  Age: " + age +"   Hair color: " + hairColor);      
  }
  //returns the guests' ages (for the elderly suite)
  public int getAge() {
    return age;
  }
  //retuns the guests' names
  public String getName(){
    return name;
  }
  //checks to see if one person matches another (used in checkIn and checkOut)
  public boolean matches(Person other) {
    if (other.height == height && other.age == age && other.name.equals(name) && other.hairColor.equals(hairColor)) {
      return true;
    }
    else {
     return false; 
    }
  }
   //checks whether or not a person qualifies for the elderly suite
    public boolean isElderly(Person guest){
        if (guest.getAge() >= 60) {
            return true;
        }
        else if (guest.getAge() < 60) {
            return false;
        }
        else {
          return false;
        }
    }
}