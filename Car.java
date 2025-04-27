class Car {
    private String model;
    private int year;
    private String manufacturer;
    private static int totalCarsProduced = 0;

    public Car(String model, int year, String manufacturer) {
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        totalCarsProduced++;
    }

    public void displayInfo() {
        System.out.println("Модель: " + model + ", Рік: " + year + ", Виробник: " + manufacturer);
    }

    public static int getTotalCarsProduced() {
        return totalCarsProduced;
    }
}