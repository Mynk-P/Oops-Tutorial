public class Abstraction {
    public static void main(String[] args) {
        Audi a1 = new Audi();
        a1.start();
    }
}
class Audi extends Car{

    @Override
    void start() {
        System.out.println("Audi car");
        
    }

}
class BMW extends Car{

    @Override
    void start() {
        System.out.println("BMW Car");
        
    }

}
// Car sirf ek concept hai jiska object banake koi use nahi isliye humne use abstract denote kar diya and uske baad object babane ki jarurat hi nahi.
abstract class Car{
    int price;
    // abstract methods ki implementatiion bhi jarurat nahi
    // abstract methods ke liye abstract class honi bhi jaruri hai.
    abstract void start();
       
}