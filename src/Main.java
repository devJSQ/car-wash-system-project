public class Main {

    
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
