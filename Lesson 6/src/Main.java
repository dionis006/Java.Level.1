public class Main {

    public static void main(String[] args) {

        new Dog("Шарик", 100).run(100);
        new Dog("Мартин",0.5F).jump(2);
        new Dog("Лео",10).swim(8);

        new Cat("Гасс", 200).run(300);
        new Cat("Мачо", 2).jump(1);
        new Cat("Зеро", 0).swim(5);

    }

}