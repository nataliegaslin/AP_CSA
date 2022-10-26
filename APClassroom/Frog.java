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

    public static boolean simulate(){
        goalDistance = saveDistance;
       for(int i = 0; i < maxHops; i++){
        int distance = hopDistance();
        System.out.println(distance);
        goalDistance -= distance;

       }

       if(goalDistance < 1){
        return true;
       }

       else{
        return false;
       }


    }

    public static double runSimulations(int num){
        double numTrue = 0;
        double numFalse = 0;
        if (num > 0){
            for(int i = 0; i <=num; i++){
                simulate();
                if(simulate() == true){
                    numTrue++;
                }
                else{
                    numFalse++;
                }
            }
            double prop = numTrue/(numTrue + numFalse);
            return prop;
        }
        else {
            return 0.0;
        }

    }

    public static void main(String[] args){
        Frog bob = new Frog(15,5);
        System.out.println(bob.simulate());
        System.out.println(runSimulations(10));

    }
}