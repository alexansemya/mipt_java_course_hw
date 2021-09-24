import java.text.DecimalFormat;
import java.util.Objects;

public class Vector
{
    private double x;
    private double y;
    private double z;
    DecimalFormat df = new DecimalFormat("#.#######");
    public Vector(double x, double y, double z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }
    // Длина вектора. Корень из суммы квадратов
    double length() {
        double len = Math.sqrt(getX() * getX() + getY() * getY() + getZ() * getZ());
        return len;
    }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector) {
        double x1 = vector.getX(), y1 = vector.getY(), z1 = vector.getZ();
        double scpr = getX() * x1 + getY() * y1 + getZ() * z1;
        return scpr;
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector) {
        double x1 = vector.getX(), y1 = vector.getY(), z1 = vector.getZ();
        Vector crpr = new Vector(getY() * z1 - getZ() * y1, getZ() * x1 - getX() * z1, getX() * y1 - getY() * x1);
        return crpr;
    }

    // Косинус между двумя векторами
    double cos(Vector vector) {
        double cs = (scalarProduct(vector)) / (length() * vector.length());
        return cs;
    }

    // Сумма двух векторов
    Vector add(Vector vector) {
        double x1 = vector.getX(), y1 = vector.getY(), z1 = vector.getZ();
        Vector res = new Vector(getX() + x1, getY() + y1, getZ() + z1);
        return res;
    }

    // Разность двух веторов
    Vector subtract(Vector vector) {
        double x1 = vector.getX(), y1 = vector.getY(), z1 = vector.getZ();
        Vector res = new Vector(getX() - x1, getY() - y1, getZ() - z1);
        return res;
    }

    @Override
    public String toString() {
        return String.format("(%1$s, %2$s, %3$s)", df.format(getX()), df.format(getY()), df.format(getZ()));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    @Override
    public int hashCode(){
        int prime = 17;
        int res = 1;
        long x = Double.doubleToLongBits(this.x);
        long y = Double.doubleToLongBits(this.y);
        long z = Double.doubleToLongBits(this.z);
        res = prime * res + (int)(((x >>> 16) ^ x) >>> 1) + (int)(((y >>> 32) ^ y) >>> 4) + (int)(((z >>> 24) ^ z) >>> 8);
        return res;
    }
    public boolean equals(Object obj){
        if (obj == this) return true;
        if (obj == null | obj.getClass() != this.getClass()) return false;
        Vector vector = (Vector) obj;
        return ((getX() == vector.getX() && getY() == vector.getY() && getZ() == vector.getZ()) ? true : false);
    }


}
