package GeekBrains;

public class Cat extends Animal {

    public Cat(String name, String colour, int age) {
        super(name, colour, age);
    }

    @Override
    public boolean Run(int distance) {
        if(distance >= 200){
            System.out.println(String.format("%s cannot run that distance", name));
            return false;
        }
        System.out.println(String.format("%s runs %s meters", name, distance));
        return true;
    }

    @Override
    public boolean Swim(int distance) {
            System.out.println(String.format("%s cannot swim", name));
            return false;
    }

    @Override
    public boolean JumpOverObstacle(double height) {
        if(height >= 2){
            System.out.println(String.format("%s cannot jump that high", name));
            return false;
        }
        System.out.println(String.format("%s jumps over obstacle %s meters heights", name, height));
        return true;
    }
}
