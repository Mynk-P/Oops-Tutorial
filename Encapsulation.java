public class Encapsulation {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setPrice(31);
        
    }
    // You can access public method from any other java file by creating a object of the file in which your method is present.   
    // public void doWork(){
    //     System.out.println("Le bro");
    // }
    // private keyword means this method u can access only inside this class , even you can not get somewhere inside this package also. 
    // private void write(){
    //     System.out.println("Nalle");
    // }
}

class Laptop{
    int ram;
    private int cost;
    public void setPrice(int cost){
        // is the user admin
        boolean isAdmin = false;
        if(!isAdmin){
            System.out.println("you can not set the price");
        }
        else{
            this.cost = cost; 
        }
        
    }
}
