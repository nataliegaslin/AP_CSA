 public class MinecraftMain {

 public static void main(String[] args) {
        MinecraftPlayer steve = new MinecraftPlayer();
        MinecraftPlayer alex = new MinecraftPlayer("alex", "alex", true);
        alex.getHealth();
        steve.damageOther(alex);
        alex.getHealth();
        steve.digDirt();
        steve.digDirt();
        steve.damageOther(alex);
        alex.damageOther(steve);
        steve.getHealth();
        alex.getHealth();
    }
 }