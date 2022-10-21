import java.lang.Math;
public class Frog {
    private static int goalDistance;
    private static int maxHops;

    public Frog (int dist, int numHops){
        goalDistance = dist;
        maxHops = numHops;
    }

    private static int hopDistance(){
        int rand = (int)(Math.random());
        return rand;

    }

    public static boolean simulate(){
        if (hopDistance() + hopDistance() + hopDistance() + hopDistance() + hopDistance() >= goalDistance){
            return true;
        }
        else{
            return false;
        }


    }

    public double runSimulations(int num){
        return 3.4;

    }

    public static void main(String[] args){
        Frog bob = new Frog(10,5);
        System.out.println(bob.simulate());
    }
}