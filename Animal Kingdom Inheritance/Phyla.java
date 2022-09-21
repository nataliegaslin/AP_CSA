public class Phyla {
    String phylaName;
    String phylaTrait;
   
    \\all of the possiblep phyla
    public Phyla(String nameP){
        phylaName = nameP;

        if(phylaName == "chordata"){
            phylaTrait = "has a notochord";
        }
        else if (phylaName == "arthropoda"){
            phylaTrait = "has an exoskeleton";
        }
        
        else if (phylaName == "annelida"){
            phylaTrait = "is a segmented worm";
        }

        else if (phylaName == "nematoda"){
            phylaTrait = "is a round worm";
        }

        else if (phylaName == "platyhelminthes"){
            phylaTrait = "is a flat worm";
        }

        else if (phylaName == "porifera"){
            phylaTrait = "is a sponge";
        }

        else if (phylaName == "echinodermata"){
            phylaTrait = "has a star-like appearance";
        }

        else if (phylaName == "cnidaria"){
            phylaTrait = "has radial symmetry";
        }

        else if (phylaName == "mollusca") {
            phylaTrait = "covered by a calcareous shell";
        }

        else {
            System.out.println("Please enter a valid phyla!");
        }
        }

     public void printTrait(){
        System.out.println("Phyla: " + phylaName);
        System.out.println("    Trait: " + phylaTrait);
     }
    }
