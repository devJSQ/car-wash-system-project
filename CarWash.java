import java.util.LinkedList;
import java.util.Queue;

class Car {
    private String type;
    private String color;
    private String plateNumber;

    public Car(String type, String color, String plateNumber) {
        this.type = type;
        this.color = color;
        this.plateNumber = plateNumber;
    }

    public void printCarDetails() {
        System.out.println("Car Type:" + type);
        System.out.println("Car Color:" + color);
        System.out.println("Car Plate:" + plateNumber);
    }
}

class WashQueue {
    private Queue<Car> carQueue;

    public WashQueue() {
        carQueue = new LinkedList<>();
    }

    public void addCar(Car car) {
        carQueue.offer(car);
    }

    public void washCar() {
        if (!carQueue.isEmpty()) {
            carQueue.poll();
        } else {
            System.out.println("No cars to wash.");
        }
    }
    public void printFirstCar() {
        if (!carQueue.isEmpty()) {
            carQueue.peek().printCarDetails();
        } else {
            System.out.println("no cars in the queue.");
        }
        System.out.println();
    }

    public void printTotalCars() {
        System.out.println("Total Cars: " + carQueue.size());
        System.out.println();
    }
}

public class CarWashSystem {
    public static void main(String[] args) {
        WashQueue queue = new WashQueue();
        queue.addCar(new Car("Sedan", "Red", "1234"));
        queue.addCar(new Car("SUV", "Black", "5678"));
        queue.addCar(new Car("Truck", "White", "91011"));
        queue.addCar(new Car("sedan", "Blue", "1213"));

        queue.printFirstCar();
        queue.printTotalCars();

        queue.washCar();

        queue.printFirstCar();
        queue.printTotalCars();
    }
}
