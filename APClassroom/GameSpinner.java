import java.lang.Math;
import java.util.ArrayList;


public class GameSpinner {
    public ArrayList<Integer> myArray = new ArrayList<Integer>();
    public int sectors;
    public GameSpinner(int numSectors){
        sectors = numSectors;
    }

    //generates a random number
    public int spin(){
       int number = (int)((Math.random() * sectors) + 1);
    
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
    public static void main(String[] args){
        GameSpinner g = new GameSpinner(4);
        System.out.println(g.spin());
        System.out.println(g.spin());
        System.out.println(g.spin());
        System.out.println(g.spin());
        System.out.println(g.spin());
        System.out.println(g.spin());
        System.out.println(g.spin());
        System.out.println("CURRENT RUN: " + g.currentRun());

    }
}