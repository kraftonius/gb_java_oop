package homework2;

public class Cat extends Animal {

    public static final int canRun = 1000;
    public static final int canJump = 100;

    public Cat(String name) {
        super(name);
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.distance <= canRun) {
            System.out.println("Кот " + this.name + " пробежал");
            return true;
        } else {
            System.out.println("Кот " + this.name + " не пробежал");
            return false;
        }
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.height <= canJump) {
            System.out.println("Кот " + this.name + " перепрыгнул");
            return true;
        } else {
            System.out.println("Кот " + this.name + " не перепрыгнул");
            return false;
        }
    }
}