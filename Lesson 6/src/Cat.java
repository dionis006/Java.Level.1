public class Cat extends Animal{

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", maxDistance=" + maxDistance +
                '}';
    }

    public Cat(String name, float maxDistance) {
        super(name, maxDistance);
    }

    @Override
    protected String getActionResult(boolean isCompleted, int distance, String toDo) {
        return String.format("Котик %s пытается %s %s м.: %s", name, toDo, distance, isCompleted);
    }
}