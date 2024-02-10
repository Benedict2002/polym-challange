package PChallange;

public class Car {
    private String name;
    private int Wheels;
    private int cylynders;
    private boolean engine;

    public Car(String name,int cylynders) {
        this.name = name;
        Wheels = 4;
        this.cylynders = cylynders;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return Wheels;
    }

    public int getCylynders() {
        return cylynders;
    }


    public boolean startEngine() {
        if (!engine) { // If the engine is currently off
            // Add code here to start the engine
            engine = true; // Example: Set engine to true to indicate it's on

            System.out.println(name + " engine is now on....");
            return true; // Return true to indicate successful engine start
        } else {
            System.out.println(name + " engine is already on");
            return false; // Return false to indicate engine is already on
        }
    }

    public void accelerate(int speed){
        if(speed >40 && speed <=60){
            System.out.println("The car is on accelerating mode");
        }else if(speed >60 && speed <=100){
            System.out.println("required Speed reached");
        }else {
            System.out.println("The "+name+" engine has not yet Started");
        }
    }
    public void brake(int brek){
        if(brek >= 120){
            System.out.println("Strart the breakes");
        }
        System.out.println(name+" is on the right track.. ");

    }
}
class Nissan extends Car{

    public Nissan() {
        super("nissan", 3);
    }

    @Override
    public boolean startEngine() {
        return true;
    }

    @Override
    public void accelerate(int speed) {
        super.accelerate(60);
    }

    @Override
    public void brake(int brek) {
        super.brake(60);
    }

}
class Pajero extends Car{

    public Pajero() {
        super("Pajero", 4);
    }

    @Override
    public boolean startEngine() {
        return false;
    }

    @Override
    public void accelerate(int speed) {
        super.accelerate(100);
    }
}
class LandCruiser extends Car{

    public LandCruiser() {
        super("Toyota Land Cruiser", 4);
        //no method Overrided;
    }
}
class maig{
    public static void main(String[] args) {

        for(int i =0 ; i < 10 ;i++) {
            Car car = randomnumber();
            System.out.println("Car #"+i+" is "+car.getName()+"\n" +"Engine "+car.startEngine()+"\n");
        }

    }
    public static Car randomnumber(){
        int randomNumber = (int)(Math.random()*3)+1;
        System.out.println("Random number generated is "+ randomNumber);
        switch (randomNumber){
            case 1:
                return new Nissan();
            case 2:
                return new Pajero();
            case 3:
                return new LandCruiser();
        }
        return null;
    }
}

