public class Subphyla extends Phyla {
    String subphylaName;
    String subphylaTrait;

    public Suphyla(String phylaNameP, subphylaNameP){
        super(phylaNameP);
        subphylaName = subphylaNameP;

        Hashtable<String, String> subphylaDict = new Hashtable<String,String>(); //https://codegym.cc/groups/posts/how-to-create-a-dictionary-in-java
        subphylaDict.put("Chelicerates", "two body segments, a sephalothorax and abdomen");
        subphylaDict.put("Crustaceans", "two pairs of antenae");
        subphylaDict.put("Labiatae", "flower");
    }

}
