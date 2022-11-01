public class Bus{
    int stops = 0;
    int currentStop = 1;
    public Bus(int numStops){
        stops = numStops;
    }
    public void move(){
        currentStop++;
        if (currentStop > stops){
            currentStop = stops;
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