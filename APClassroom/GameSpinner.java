import java.util.Random;
public class GameSpinner{
    public int sectors;
    public int spins = 0;
    public GameSpinner(int numSectors){
        sectors = numSectors;
    }
    //generates a random number
    public int spin(){
        Random random = new Random();
        int number = random.nextInt(sectors);
        return number;

    }
    public int currentRun(){
        int []spinList = new int[100];
        for(int i = 0; i<spinList.count(); i++){
            spinList[i] = spin();

        }
        System.out.println(spinList);

        
    }
    public static void main(String[] args){
        GameSpinner g = new GameSpinner(10);
        System.out.println(g.spin());
    }
}