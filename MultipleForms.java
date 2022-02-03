public class MultipleForms {
    public static void main(String[] args) {
        animal a = new animal();
        a.breed = "xyz";
        a.name = "Horse";
        // These are multiple forms which are known as polymorphism. 
        a.walk();
        a.walk(1000);
    }
}
class animal{
    String name;
    String breed;
    void walk(){
        System.out.println(name + " is walking");
    } 
    void walk(int speed){
        System.out.println(name + " is walking with a " + speed);
    }
}
