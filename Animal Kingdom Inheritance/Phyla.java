public class Phyla {
    String phylaName;
    String phylaTrait;
    Subphyla subphylaOne;
    Subphyla subphylaTwo;
    

    public Phyla(String nameP){
        phylaName = nameP;
        if(phylaName == "Chordata"){
            subphylaOne = new Subphyla("vertebrata");
            subphylaTwo = null
        else if (phylaName == "Arthropoda"){
            subphylaOne = new Subphyla("Chelicerates");
            subphylaTwo = new Subphyla("Crustaceans");
        }
        }
    }

    public String whichPhyla(String inputPhyla){
        Hashtable<String, String> phylaDict = new Hashtable<String,String>(); //https://codegym.cc/groups/posts/how-to-create-a-dictionary-in-java
            phylaDict.put("Annelida", "segmented worm");
            phylaDict.put("Nematoda", "round worm")
            PhylaDict.put("Arthropoda", "exoskeleton");
            phylaDict.put("Platyhelminthes", "flat worm");
            
    }
}