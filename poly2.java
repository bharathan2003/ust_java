public class poly2 {
    public static void main(String args[]){
        Vehicle v = new Vehicle();
        v.speedUp();

        Car c = new Car();
        
        c.speedUp(15);

        Bicycle b = new Bicycle();
        b.speedUp(25);
    }
    
}
class Vehicle{
    void speedUp(){
        System.out.println("base vehicle class.");
    }
}
class Car extends Vehicle{
    void speedUp(int s){
        System.out.println("Car class "+ s*10);
    }
}
class Bicycle extends Vehicle{
    void speedUp(int b){
        System.out.println("Bicycle class "+ (b+5));
    }
}


