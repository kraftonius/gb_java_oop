package homework2;

public class Human extends Animal {

    public static final int canRun = 2000;
    public static final int canJump = 200;

    public Human(String name) {
        super(name);
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.distance <= canRun) {
            System.out.println("Человек " + this.name + " пробежал");
            return true;
        } else {
            System.out.println("Человек " + this.name + " не пробежал");
            return false;
        }
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.height <= canJump) {
            System.out.println("Человек " + this.name + " перепрыгнул");
            return true;
        } else {
            System.out.println("Человек " + this.name + " не перепрыгнул");
            return false;
        }
    }
}
