public class B extends Cat

{

public String message(int i)

{

return "B" + i;

}

public static void main(String[] args){
Cat obj1 = new B(); // Line 1

B obj2 = new B(); // Line 2

System.out.println(obj1.message(3));   // Line 3

System.out.println(obj2.message(2));   // Line 4
}

}