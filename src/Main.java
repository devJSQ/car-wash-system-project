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
        System.out.println("Car Type: " + type);
        System.out.println("Car Color: " + color);
        System.out.println("Car Plate: " + plateNumber);
        System.out.println();
    }
}
class WashQueue {
    private final int MAX_SIZE = 100;
    private Car[] queue = new Car[MAX_SIZE];
    private int front = 0;
    private int rear = 0;
    private int size = 0;

    public void addCar(Car car) {
        if (size == MAX_SIZE) {
            System.out.println("Queue is full, cannot add more cars :(");
            return;
        }
        queue[rear] = car;
        rear = (rear + 1) % MAX_SIZE;
        size++;
    }

    public void washCar() {
        if (size == 0) {
            System.out.println("No cars to wash.");
            return;
        }
        front = (front + 1) % MAX_SIZE;
        size--;
    }

    public void printFirstCar() {
        if (size == 0) {
            System.out.println("no cars in the queue.");
            System.out.println();
        } else {
            queue[front].printCarDetails();
        }
    }

    public void printTotalCars() {
        System.out.println("Total Cars: " + size);
        System.out.println();
    }
}

public class CarWashSystem {
    public static void main(String[] args) {
        WashQueue queue = new WashQueue();
        queue.addCar(new Car("Sedan", "Red", "1234"));
        queue.addCar(new Car("SUV", "Black", "5678"));
        queue.addCar(new Car("Truck", "White", "91011"));
        queue.addCar(new Car("Sedan", "Blue", "1213"));

        queue.printFirstCar();
        queue.printTotalCars();

        queue.washCar();

        queue.printFirstCar();
        queue.printTotalCars();
    }
}
