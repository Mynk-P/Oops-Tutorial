public class Inheritance{
    public static void main(String[] args) {
        A ob = new A();
        ob.age = 90;
        ob.id = 10;
        System.out.println(ob.age);
        System.out.println(ob.id);
        B obj = new B(); 
        obj.doWork();

        // Encapsulation objj = new Encapsulation();
        // objj.doWork();
    }
}
class B extends A{
    void doWork(){
        System.out.println("null value");
    }
}
class A{
    int age;
    int id;
    void doWork(){
        System.out.println("Person is doing work");
    }
}