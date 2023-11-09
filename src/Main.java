class Engine{
    private String type;
    public Engine(String type){
        this.type = type;
    }
    public void start(){
        System.out.println("The engine has started: ");
    }
}
class Car{
    private String model;
    private Engine engine;
    public Car(String model,Engine engine){
        this.model = model;
        this.engine = engine;
    }
    public void startCar(){
        System.out.println("starting the car of model " + model);
        engine.start();
    }
}

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine("V8");
        Car mycar = new Car("sedan",engine1);
        mycar.startCar();
    }
}
