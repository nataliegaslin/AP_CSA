public class MinecraftPlayer {
    String username;
    String skin;
    int health = 20;
    boolean rightHanded;
    int totalDirt = 0;

    MinecraftPlayer(){
        username = "Minecraft Player";
        skin = "steve";
        rightHanded = true;
    }

    MinecraftPlayer(String user, String skinName, boolean isRightHanded){
        username = user;
        skin = skinName;
        rightHanded = isRightHanded;
    }

    public void digDirt() {
        totalDirt++;
        System.out.println(username + " has dug " + totalDirt + " blocks.");
    }

    public int getHealth() {
        System.out.println(username + " has " + health + " health points.");
        return health;
        //getter method
    }

    public int setHealth(int change){
        health = health + change;
        return health;
        // setter method
    }

    public void damageOther(MinecraftPlayer plyr){
        plyr.setHealth(-5);
        System.out.println(plyr.username + ": Oof!");
    }

}