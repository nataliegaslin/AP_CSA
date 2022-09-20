public class Subphyla extends Phyla {
    String subphylaName;
    String subphylaTrait;

    public Suphyla(String subphylaNameP, phylaNameP){
        super(phylaNameP);
        subphylaName = subphylaNameP;

        if (subphylaName == "chelicerate"){
            subphylaTrait = "has no antennae";
        }

        else if (subphylaName == "crustecean"){
            subphylaTrait == "has two pairs of antennae";
        }
         else if (subphylaName == "labiatae"){
            subphylaTrait = "is a millipede or centipede";
       
        }
         else if (subphylaName == "vertebrata"){
            subphylaTrait = "has a spinal chord";
         }
         else {
            System.out.println("Please enter a valid subphyla!");
         }
    }

    public void printTrait(){
        System.out.println("Subphyla: " + subphylaName);
        System.out.println("Trait: " + subphylaTrait);
        super.printTrait();
}
