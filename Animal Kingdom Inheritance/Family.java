public class Family extends AnimalClass {
    String familyName;
    String familyTrait;
    \\ a variety of different families, but not every single one
    public Family(String famNameP, String classNameP, String subphylaNameP, String phylaNameP){
        super(classNameP, subphylaNameP, phylaNameP);
        familyName = famNameP;

    if(familyName == "shark"){
        familyTrait = "has 7 pairs of lateral gill slits";
    }
    else if(familyName == "alligator"){
        familyTrait = "has a c-shaped nose";
    }

   else if(familyName == "penguin"){
        familyTrait = "waddles around";
    }

     else if(familyName == "butterfly"){
        familyTrait = "has reflectional symmetry";
    }

     else if(familyName == "frog"){
        familyTrait = "has webbed toes";
    }

     else if(familyName == "snake"){
        familyTrait = "doesn't have any arms";
    }

     else if(familyName == "bird"){
        familyTrait = "has feathers and wings";
    }

     else if(familyName == "otter"){
        familyTrait = "ADORABLE and loyal";
    }


    else {
        System.out.println("Please enter a valid family name!");
    }

    }
    public void printTrait(){
        System.out.println("Family: " + familyName);
        System.out.println("    Trait: " + familyTrait);
        super.printTrait();
    }
}
