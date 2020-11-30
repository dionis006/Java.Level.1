public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(40);
        Cat cat1 = new Cat("Мурзик", 10); // Создать кота
        Cat cat2 = new Cat("Туча", 10); // Создать кота
        Cat cat3 = new Cat("Саймон", 10); // Создать кота
        cat1.eat(plate); // Кормить кота
        cat2.eat(plate); // Кормить кота
        cat3.eat(plate); // Кормить кота
        plate.info(); // Остаток еды в тарелке

        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Морошка", 10),
                new Cat("Васюська", 10),
                new Cat("Кузя", 10),
                new Cat("Шелдон", 10)
        }; // Создать массив котов

        plate.addFood(10); // Добавить еды
        Cats.eatMassive(plate, cats); // Кормить массив котов
        plate.info(); // Остаток еды в тарелке
    }

}