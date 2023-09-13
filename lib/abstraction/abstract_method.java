package abstraction;
abstract class Vehicale{
    abstract void Star();
}
class Car extends Vehicale{
    void Star(){
        System.out.println("Car Start with Key");
    }
}
class Scooter extends Vehicale{
    void Star(){
        System.out.println("Scooter start with Kick");
    }
}
class Main {
    public static void main(String[] args) {
     Car c = new Car();
     c.Star();
     Scooter s = new Scooter();
     s.Star();   
    }
}