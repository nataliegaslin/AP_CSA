public class Person {
  private double height;
  private int age;
  private String name;
  private String hairColor;

  Person(double h, int a, String n, String hC) {
    height = h;
    age = a;
    name = n;
    hairColor = hC;
  }
  public String toString() {
    return ("Guest info: Name: " + name + "   Height: " + height + "  Age: " + age +"   Hair color: " + hairColor);      
  }
  public int getAge() {
    return age;
  }
  public String getName(){
    return name;
  }
  public boolean matches(Person other) {
    if (other.height == height && other.age == age && other.name.equals(name) && other.hairColor.equals(hairColor)) {
      return true;
    }
    else {
     return false; 
    }
  }
}