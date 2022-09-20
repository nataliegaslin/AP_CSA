public class AnimalClass extends Subphyla {
    String className;
    String classTrait;

    public AnimalClass(String classNameP, String subphylaNameP, String phylaNameP){
        super(subphylaNameP, phylaNameP);
        className = classNameP;

        if(className == "amphibian"){
            classTrait = "can breathe on land or in water";
        }

        else if (className == "reptile"){
            classTrait = "is cold blooded";
        }
        else {
            System.out.println("Please enter a valid class!");
        }
    }


     public void printTrait(){
        System.out.println("Class: " + className);
        System.out.println("Trait: " + classTrait);
        super.printTrait();
}