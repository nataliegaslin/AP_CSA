public class Bus{
    int stops;
    int currentStop;
    boolean direction;
    public Bus(int numStops){
        stops = numStops;
        currentStop = 1;
    }
    public void move(){
        if (currentStop ==1){
            direction = true;
            currentStop++;
        
            }
        if (direction == true){
            currentStop++;
        }
        if(currentStop >= stops){
            direction = false;
        }
        if(direction == false){
            currentStop--;
        }
        }

    public int getCurrentStop(){
        return currentStop;
    }

    public static void main(String[] args){
        Bus bus1 = new Bus(3);
        bus1.move();
        bus1.move();
        bus1.move();
        bus1.move();
        System.out.println(bus1.getCurrentStop());
    }
}
