public class Methods {
    public static void main(String[] args) {
        System.out.println("Methods");
        Student s1 = new Student();
        s1.id = 10;
        s1.name = "rudhra";
        System.out.println(s1.id);
        System.out.println(s1.name);
        s1.write();
        s1.read();
    }
}
class Student{
    int id;
    String name;
    void write(){
        System.out.println(name + " is writing something");
    } 
    void read(){
        System.out.println(name + " read a book");
    }
}
