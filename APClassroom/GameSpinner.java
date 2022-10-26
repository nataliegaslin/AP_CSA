import java.util.Random;
import java.util.ArrayList;


public class GameSpinner {
    public ArrayList<Integer> myArray = new ArrayList<Integer>();
    public int sectors;
    public GameSpinner(int numSectors){
        sectors = numSectors;
    }

    //generates a random number
    public int spin(){
        Random random = new Random();
        int number = random.nextInt(sectors);
    
        int l = 0;
        while(l < 1){
            if(myArray.isEmpty()){
                myArray.add(number);
            }
            else if (myArray.get(l) == number){
                myArray.add(number);
            }
            else {
                myArray.clear();
                myArray.add(number);
            }
            l++;
        }
        return number;

    }
    public int currentRun(){
        int nums = 0;
        for(int h = 0; h < myArray.size(); h++){
            if(myArray.get(h) != null){
                nums++;
            }
        }
        return nums;
       }      
}