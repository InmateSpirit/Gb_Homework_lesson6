package GeekBrains;


public class Dog extends Animal {
    private int runrange;

    public Dog(String name, String colour, int age, int runrange) {
        super(name, colour, age);
        this.runrange = runrange;
    }

    @Override
    public boolean Run(int distance) {
        if(distance >= 500){
            System.out.println(String.format("%s cannot run that distance", name));
            return false;
        }
        System.out.println(String.format("%s runs %s meters", name, distance));
        return true;
    }

    @Override
    public boolean Swim(int distance) {
        if(distance >= 10){
            System.out.println(String.format("%s cannot swim that distance", name));
            return false;
        }
        System.out.println(String.format("%s swims %s meters", name, distance));
        return true;

    }

    @Override
    public boolean JumpOverObstacle(double height) {
        if(height > 0.5){
            System.out.println(String.format("%s cannot jump that high", name));
            return false;
        }
        System.out.println(String.format("%s jumps over obstacle %s meters heights", name, height));
        return true;
    }
    public boolean RunRandomRange(int distance) {
        if(distance > 900*Math.random()){
            System.out.println(String.format("%s cannot run that distance", name));
            return false;
        }
        System.out.println(String.format("%s runs %s meters", name, distance));
        return true;
    }
    public boolean RunRandom(int distance) {
        double b = Math.random();
        if (b > 0.5) {
            if (distance > 600) {
                System.out.println(String.format("%s cannot run that distance", name));
                return false;
            }
        } else {
            if (distance > 400) {
                System.out.println(String.format("%s cannot run that distance", name));
                return false;
            }
        }
        System.out.println(String.format("%s runs %s meters", name, distance));
        return true;
    }
    public boolean RunRange(int distance) {
        if(distance >= runrange){
            System.out.println(String.format("%s cannot run that distance", name));
            return false;
        }
        System.out.println(String.format("%s runs %s meters", name, distance));
        return true;
    }

}
