public abstract class Animal {

    protected String name;
    protected float maxDistance;

    public Animal(String name, float maxDistance) {
        this.name = name;
        this.maxDistance = maxDistance;
    }

    protected abstract String getActionResult(boolean isCompleted, int distance, String toDo);

    public void run(int distance) {
        boolean isRun = distance <= maxDistance;
        String toDo = "пробежать";
        System.out.println(toString());
        System.out.println(getActionResult(isRun, distance, toDo) +  "\n");
    }

    public void jump(int distance){
        boolean isJump = distance <= maxDistance;
        String toDo = "прыгнуть";
        System.out.println(toString());
        System.out.println(getActionResult(isJump, distance, toDo) +  "\n");
    }

    public void swim(int distance) {
        boolean isSwim = distance <= maxDistance;
        String toDo = "проплыть";
        System.out.println(toString());
        System.out.println(getActionResult(isSwim, distance, toDo) +  "\n");
    }

}