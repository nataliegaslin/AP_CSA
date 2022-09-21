public class Animal extends Family {
    String name;
    String uniqueTrait;
    \\order: name of animal, trait of animal, family, class, subphyla, phyla
    public Animal(String nameP, String traitP, String famNameP, String classNameP, String subphylaNameP, String phylaNameP) {
        super(famNameP, classNameP, subphylaNameP, phylaNameP);
        name = nameP;
        uniqueTrait = traitP;
    }

    public void printTrait(){
        System.out.println("");
        System.out.println("Animal: " + name);
        System.out.println("    Trait: " + uniqueTrait);
        super.printTrait();
    }
}
