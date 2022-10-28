import java.lang.Math;
public class Frog {
    private static int goalDistance;
    private static int maxHops;
    public static int saveDistance;

    public Frog (int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
        saveDistance = goalDistance;
    }

    private static int hopDistance(){
        int rand = (int)((Math.random() * goalDistance) + 1);
        return rand;

    }

    public static boolean simulate(){ // returns true if the frog has passed the goal and false otherwise
        int nHops = 0;
        int totalDistance = 0;

        while(nHops < maxHops){
            totalDistance += hopDistance();
            nHops++;

            if(totalDistance >= goalDistance){
                return true;
            }
            if(totalDistance <= 0){
                return false;
            }
        }
        return false;
    }
    public static double runSimulations(int num){ //counts how many out of the simluation are true and how many are false
        double numTrue = 0; // how many passed
        double numFalse = 0; // how many failed
        if (num > 0){
            for(int i = 0; i < num; i++){
                simulate();
                if(simulate() == true){
                    numTrue++;
                }
                else{
                    numFalse++;
                }
            }
            double prop = numTrue/(numTrue + numFalse);
            System.out.println("NUM PASSED: " + numTrue);
            System.out.println("NUM FAILED: " + numFalse);
            return prop;
        }
        else {
            return 0.0;
        }

    }

    public static void main(String[] args){
        Frog bob = new Frog(20,3);
        System.out.println(bob.simulate());
        System.out.println("PRPOPRTION: " + runSimulations(20));

    }
}