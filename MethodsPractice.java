public class MethodsPractice {
    double height;
    String name;
    int age;

    MethodsPractice(double h, String n, int a) {
        height = h;
        name = n;
        age = a;
    }
    public void greet(){
        System.out.println("Hello! My name is " + name + " and I am " + age + " years old.");
    }
    public void tall(){
        System.out.println("I am " + height + " inches tall.");
    }
     public static void main (String[] args){
        MethodsPractice bob = new MethodsPractice (56.3, "bob", 14);
        bob.tall();
        bob.greet();
     }
}