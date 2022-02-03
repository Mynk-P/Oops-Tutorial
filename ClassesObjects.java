public class ClassesObjects {
    public static void main(String[] args) {
        // To create a object of a class
        // You can create many object as you want
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "Mayank";
        System.out.println(p1.age);
        System.out.println(p1.name);

        Person p2 = new Person();
        p2.age = 278;
        p2.name = "Roy";
        System.out.println(p2.age);
        System.out.println(p2.name); 
        
    }
}
// Person is a name of class
class Person{
    String name;
    int age;
}