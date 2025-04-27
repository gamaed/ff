public class CarFactory {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla Model S", 2022, "Tesla");
        Car car2 = new Car("Ford Mustang", 2021, "Ford");

        car1.displayInfo();
        car2.displayInfo();

        System.out.println("Загальна кількість вироблених автомобілів: " + Car.getTotalCarsProduced());
    }
}