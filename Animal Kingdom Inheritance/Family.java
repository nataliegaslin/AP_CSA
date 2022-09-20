public class Family extends AnimalClass {
    String familyName;
    String familyTrait;

    public Family(String famNameP, String classNameP, String subphylaNameP, String phylaNameP){
        super(classNameP, subphylaNameP, phylaNameP);
        familyName = famNameP;
    }

    if(familyName == "shark"){
        familyTrait = "has 7 pairs of lateral gill slits";
    }
    else {
        System.out.println("Please enter a valid family name!");
    }

    public void printTrait(){
        System.out.println("Family: " + familyName);
        System.out.println("Trait: " + familyTrait);
        super.printTrait();
}