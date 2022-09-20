public class Animal extends Family {
    String name;
    String uniqueTrait;

    public Animal(String nameP, String traitP, String famNameP, String classNameP, String suybphylaNameP, String phylaNameP) {
        super(famNameP, classNameP, subphylaNameP, phylaNameP);
        name = nameP;
        uniqueTrait = traitP;
    }

    public void printTrait(){
        System.out.println("Animal: " + name);
        System.out.println("Trait: " + uniqueTrait);
        super.printTrait();
    }
}