public class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }
    public int getCylinders() {
        return cylinders;
    }
    public String startEngine (){
        return "Car: Start";
    }
    public String accelerate (){
        return "Car: Speed up";
    }
    public String brake (){
        return "Car: Stop";
    }
}
class BMW extends Car{
    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "BMW: start";
    }

    @Override
    public String accelerate() {
        return "BMW: Speed up";
    }

    @Override
    public String brake() {
        return "BMW: Stop";
    }
}
class Main{
    public static void main (String [] args) {
        Car car = new Car("Base car", 4);
        System.out.println( car.startEngine());
        System.out.println( car.accelerate());
        System.out.println( car.brake());
        BMW BMW = new BMW("BMW", 6);
        System.out.println( BMW.startEngine());
        System.out.println( BMW.accelerate());
        System.out.println( BMW.brake());
        Vinfast Vinfast = new Vinfast("Vinfast", 8);
        System.out.println( Vinfast.startEngine());
        System.out.println( Vinfast.accelerate());
        System.out.println( Vinfast.brake());
    }

    static class Vinfast extends Car{
        public Vinfast(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public String startEngine() {
            return "Vinfast: start";
        }

        @Override
        public String accelerate() {
            return "Vinfast: Speed up";
        }

        @Override
        public String brake() {
            return "Vinfast: Stop";
        }
    }
}
