public class Main {

    public static void main(String[] args) {

        Employee empl = new Employee("Sergey", "Ivanov", "Director", "dir@gmail.com", "+79999999999", 100000, 38);
        System.out.println(empl);

        Employee[] persons = {
                new Employee("Sergey", "Ivanov", "Director", "dir@gmail.com", "+79999999999", 100000, 38),
                new Employee("Andrey", "Mishakov", "Deputy Director", "dd@gmail.com", "+79851235611", 70000, 44),
                new Employee("Vasiliy", "Smolniy", "Head of Development Department", "hdd@gmail.com", "+79851464567", 60000, 41),
                new Employee("Artem", "Menshikov", "Manager", "man1@gmail.com", "+79851234555", 40000, 22),
                new Employee("Ivan", "Petrov", "Manager", "man2@gmail.com", "+79851234567", 40000, 25),
        };


        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getAge() > 40) {
                System.out.println(persons[i]);
            }
        }
    }
}