import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Set<Object> set1 = new Set<>();
        Set<Object> set2 = new Set<>();
//        System.out.println("Введите элементы первого множества:");
//        Scanner sc = new Scanner(System.in);
        set1.add(1);
        set1.add(2);
        set1.add(3);
//        set1.add(new int[]{1, 2});
        set2.add("1");
        set2.add(3);
        set2.add(0);
//        set2.add(new int[]{1, 2, 3});
        System.out.println(set1.symmetricDifference(set1, set2));
    }
}
