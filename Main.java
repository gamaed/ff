public class Main {
    public static void main(String[] args) {
        Dish soup = new Dish("Берщ", 10.0, "Перша страви");
        Dish pizza = new Dish("Пуца Маргарита", 20.0, "Основна страви");
        Dish iceCream = new Dish("Ванільне морозиво", 8.0, "Десет");

        Restaurant.addDish(soup);
        Restaurant.addDish(pizza);
        Restaurant.addDish(iceCream);

        System.out.println("Меню ресторану:");
        Restaurant.displayMenu();

        System.out.println("Загальна кількість страв у меню: " + Restaurant.getTotalDishes());
    }
}