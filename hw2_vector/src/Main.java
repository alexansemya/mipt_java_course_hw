import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.#######");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты первого вектора:");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble(), z1 = sc.nextDouble();
        Vector vector1 = new Vector(x1, y1, z1);
        System.out.println("Введите координаты второго вектора:");
        double x2 = sc.nextDouble(), y2 = sc.nextDouble(), z2 = sc.nextDouble();
        Vector vector2 = new Vector(x2, y2, z2);
        System.out.println(String.format("Длина первого вектора: %1s %nДлина второго вектора: %2s", df.format(vector1.length()), df.format(vector2.length())));
        System.out.println(String.format("Скалярное произведение векторов: %s", df.format(vector1.scalarProduct(vector2))));
        System.out.println(String.format("Результирующим вектором векторного произведения первого и второго вектора будет вектор a%s", vector1.crossProduct(vector2).toString()));
        System.out.println(String.format("Результирующим вектором суммы первого и второго вектора будет вектор b%s", vector1.add(vector2).toString()));
        System.out.println(String.format("Результирующим вектором разности первого и второго вектора будет вектор c%s", vector1.subtract(vector2).toString()));
//        System.out.println(vector1.equals(vector1));
//        System.out.println(vector1.equals(vector2));
//        System.out.println(vector1.hashCode());
//        System.out.println(vector2.hashCode());
    }
}
