public class Cat {

    protected Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    private String name;
    private int appetite;
    public boolean satiety = false;

    public void eat(Plate p){
        satiety = p.decreaseFood(appetite);
        System.out.format("%s: %s \n", name, satiety);
    }

}