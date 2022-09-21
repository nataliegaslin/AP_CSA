public class AnimalMain{ 
    
    public static void main(String[] args){
        Animal shark = new Animal ("hammerhead shark", "has a flat head", "shark", "reptile", "vertebrata", "chordata");
        shark.printTrait();
        Animal butterfly = new Animal ("emperor butterfly", "is yellow", "butterfly", "insect", "crustecean", "arthropoda");
        butterfly.printTrait();
        Animal otter = new Animal ("sea otter", "intelligent", "otter", "mammal", "vertebrata", "chordata");
        otter.printTrait();
    }
}
