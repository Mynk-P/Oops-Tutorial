public class StaticKey {
    public static void main(String[] args) {
        Bike bi = new Bike();
        bi.name = "Bugati";
        bi.price = 10000;
        System.out.println(bi.name);
        System.out.println(bi.price);
        bi.Ride();
        // We are accessing a count variable using name of class because it is using static keyword.
        System.out.println(Bike.count);
    }
}
class Bike{
    int price;
    String name;
    // static lagate hi ye aab class ki property na ki object ki and jise hum class ke name ke help se access karenge.
    static int count;
    public Bike(){
        count++;
        System.out.println("Riding a bike");
    }
    void Ride(){

        System.out.println("Person can ride a" + name);
    }
}
