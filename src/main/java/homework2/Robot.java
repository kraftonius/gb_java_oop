package homework2;

public class Robot extends AnimaloidForm {

    public static final int canRun = 3000;
    public static final int canJump = 300;

    public Robot(String name) {
        super(name);
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.distance <= canRun) {
            System.out.println("Робот " + this.name + " пробежал");
            return true;
        } else {
            System.out.println("Робот " + this.name + " не пробежал");
            return false;
        }
    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.height <= canJump) {
            System.out.println("Робот " + this.name + " перепрыгнул");
            return true;
        } else {
            System.out.println("Робот " + this.name + " не перепрыгнул");
            return false;
        }
    }
}