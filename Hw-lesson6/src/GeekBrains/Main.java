package GeekBrains;

public class Main {

    public static void main(String[] args) {
	Dog Bark = new Dog("Bark", "black", 3, 400);
	Cat Mur = new Cat("Mur", "white", 1);

	Mur.Run(1200);
	Mur.Swim(1);
	Mur.JumpOverObstacle(1.3);
	Bark.Run(300);
	Bark.JumpOverObstacle(0.3);
	Bark.Swim(14);
	Bark.RunRandomRange(600);
	Bark.RunRandom(550);
	Bark.RunRange(500);
    }
}
