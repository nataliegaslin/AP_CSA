class SuperClass{
    int x = 0; 
    int y = 5;
    int z = 10;

    SuperClass(){
        System.out.println("x:" +x);
        System.out.println("y:" + y);
        System.out.println("z:" + z);
        System.out.println(x+y+z);
    }

    public static void main(String[] args){
        SuperClass superGuy = new SuperClass();
        SubClass subGuy = new SubClass();
    }
} 