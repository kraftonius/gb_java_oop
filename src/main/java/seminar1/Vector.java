package seminar1;

import java.util.ArrayList;

public class Vector {
    double x;
    double y;
    double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     *
     * @param vector вектор с которым происходит умножениее
     * @return скалярное произведение
     * @apiNote метод, вычисляющий скалярное произведение
     */
    public double scal(Vector vector) {
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }


    /**
     *
     * @param vector Принимает в качестве параметра вектор на который делается векторное произведение.
     * @return Новый вектор
     * @apiNote метод, вычисляющий векторное произведение
     */
    public Vector vprod(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }


    /**
     *
     * @param vector Примается в качестве значения
     * @return угол
     * @apiNote Метод вычисляюший угол между векторами
     */
    public double angle(Vector vector) {
        return scal(vector)/(length()*vector.length());
    }
}
