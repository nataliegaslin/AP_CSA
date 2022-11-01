public class Bus{
    int stops;
    int currentStop;
    public Bus(int numStops){
        stops = numStops;
        currentStop = 1;
    }
    public void move(){
        currentStop++;
        if (currentStop > stops){
            currentStop = stops;
            while(currentStop >1){
                currentStop--;
            }
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
