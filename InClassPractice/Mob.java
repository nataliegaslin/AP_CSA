public class Mob{
    String name;
    int health;

    Mob(String name_p, int health_p){
        name = name_p;
        health = health_p;
    }
    public void printAttributes(){
        System.out.println("name: " + name ", health: " + health);
    }
}