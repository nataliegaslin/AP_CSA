public class AnimalClass extends Subphyla {
    String className;
    String classTrait;

    \\all available animal classes
    public AnimalClass(String classNameP, String subphylaNameP, String phylaNameP){
        super(subphylaNameP, phylaNameP);
        className = classNameP;

        if(className == "amphibian"){
            classTrait = "can breathe on land or in water";
        }

        else if (className == "reptile"){
            classTrait = "is cold blooded";
        }
        
        else if (className == "bird"){
            classTrait = "has wings and feathers";
        }
        
        else if (className == "mammal"){
            classTrait = "is warm blooded";
        }
        
        else if (className == "bony fish"){
            classTrait = "is a fish with little extra tissue";
        }
        
        else if (className == "cartilaginous fish"){
            classTrait = "is mostly made up of cartilage";
        }
        
        else if (className == "lamprey"){
            classTrait = "has a funnel-like mouth";
        }
        
        else if (className == "hagfish"){
            classTrait = "produces slime";
            
        }
        else if (className == "horseshoe crab"){
            classTrait = "has a hard carapace";
        }
        
        else if (className == "spider" || className == "scorpion"){
            classTrait = "has eight legs";
        }
        
        else if (className == "crab" || className == "lobster" || className == "shrimp"){
            classTrait = "has a thick exoskeleton";
        }
        
        else if (className == "barnacle"){
            classTrait = "grows on piers";
        }
        
        else if (className == "insect"){
            classTrait = "has six legs";
        }
        
        else if (className == "centipede"){
            classTrait = "is venemous";
        }
        
        else if (className == "millipede"){
            classTrait = "is harmless to humans";
        }
        
        else if (className == "starfish"){
            classTrait = "has five arms";
        }
        
        else if (className == "sea urchin" || className == "sand dollar"){
            classTrait = "has five-fold symmetry";
        }
        
        else if (className == "jellyfish"){
            classTrait = "doesn't have any blood";
        }
        
        else if (className == "coral" || className == "anenome") {
            classTrait = "has bright colors";
        }

        else if (className == "oyster" || className == "clam"){
            classTrait = "shells are very calcified";
        }
        
        else if (className == "snail" || className == "slug" || className == "periwinkle"){
            classTrait = "has a ribbon-like tongue";
        }
        
        else if (className == "squid" || className == "octopus"){
            classTrait = "has a soft body";
        }
        else {
            System.out.println("Please enter a valid class!");
        }
    }


     public void printTrait(){
        System.out.println("Class: " + className);
        System.out.println("    Trait: " + classTrait);
        super.printTrait();
}
}
