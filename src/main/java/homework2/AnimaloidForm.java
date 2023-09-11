package homework2;

import java.util.ArrayList;
import java.util.List;

public abstract class AnimaloidForm {

    protected String name;

    public AnimaloidForm(String name) {
        this.name = name;
    }

    protected abstract boolean run(Treadmill treadmill);

    protected abstract boolean jump(Wall wall);


    @Override
    public String toString() {
        return name;
    }
}
