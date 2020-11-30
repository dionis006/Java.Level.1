public class Plate {

    protected Plate(int food) {
        this.food = food;
    }

    private int food;

    public void info() {
        System.out.println("Остаток в тарелке: " + food + "\n");
    }

    protected boolean decreaseFood(int n) {
        if (food >= n) {
            food = food - n;
            return true;
        } else return false;
    }

    public void addFood (int newFood){
        food = food + newFood;
        System.out.println("Пополнение тарелки на " + newFood + ". Остаток: " + food);
    }
}