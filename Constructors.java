public class Constructors {
    public static void main(String[] args) {
        // new keyword ke badd jo bhi likha hai usse hum constructor call kar rahe hote hai. 
        Dog dg = new Dog();
        dg.age = 20;
        dg.name = "Bull dog";
        dg.walk();
        dg.walk(200);
    }
}
class Dog{
    int age;
    String name;

    public Dog(){
        System.out.println("Creating an object");
    }    void walk(){
        System.out.println(name + " is walking on a street");
    } 
    void walk(int steps){
        System.out.println(name + " covered " + steps + "Steps");
    }
}