public class Thiskey {
    public static void main(String[] args) {
        Bike1 bi = new Bike1();
        bi.name = "Bugati";
        bi.price = 10000;
        System.out.println(bi.name);
        System.out.println(bi.price);
        bi.Ride();
        // We are accessing a count variable using name of class because it is using static keyword.
        System.out.println(Bike1.count);

        Bike1 bk = new Bike1(22 , "apache");
        
    }
}
class Bike1{
    int price;
    String name;
    // static lagate hi ye aab class ki property na ki object ki and jise hum class ke name ke help se access karenge.
    static int count;
    public Bike1(){
        count++;
        System.out.println("Riding a bike");
    }

    public Bike1(int price , String name ){
        // With the help of this keyword we can call our previous constructor of same name of class.s
             this();
             // Constructor help to 
             this.name = name;
             this.price = price;  
    }

    void Ride(){

        System.out.println("Person can ride a" + name);
    }

}