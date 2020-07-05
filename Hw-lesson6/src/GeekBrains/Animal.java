package GeekBrains;

public abstract class Animal {
    protected String name;
    protected String colour;
    protected int age;

    public Animal(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }
    public abstract boolean Run(int a);
    public abstract boolean Swim(int a);
    public abstract boolean JumpOverObstacle(double a);
}
