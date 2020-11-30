public class Dog extends Animal {

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", maxDistance=" + maxDistance +
                '}';
    }

    public Dog(String name, float maxDistance) {
        super(name, maxDistance);
    }

    @Override
    protected String getActionResult(boolean isCompleted, int distance, String toDo) {
        return String.format("Собачка %s пытается %s %s м.: %s", name, toDo, distance, isCompleted);
    }
}