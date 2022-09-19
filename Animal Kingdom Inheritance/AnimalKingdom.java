public class AnimalKingdom {
    Phyla phylaOne;
    Phyla phylaTwo;

    String name;
    String uniqueTrait;

    public AnimalKingdom (String nameP, String traitP){
        phylaOne = new Phyla("Arthropoda");
        phylaTwo = new Phyla("Chordata");
        name = nameP;
        uniqueTrait = trait;
        System.out.println(uniqueTrait);

    }
    
    public String getTrait(){
        return uniqueTrait;
    }
    public void printTrait(){
        System.out.println("Animal: " + name);
        System.out.println("Trait: " + uniqueTrait);
    }
       
    }
