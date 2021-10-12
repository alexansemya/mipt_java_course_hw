import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    static final int SIZE = 20;
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        String data[] = (sc.nextLine().split(" "));
        ArrayList<Integer> arrayInput= new ArrayList<>();
        ArrayList<Integer> dividedByTwo = new ArrayList<>();
        ArrayList<Integer> dividedByThree = new ArrayList<>();
        ArrayList<Integer> rest = new ArrayList<>();
        for (int i = 0; i < data.length; i++)
        {
            try
            {
                arrayInput.add(Integer.parseInt(data[i]));
            }
            catch (NumberFormatException error)
            {
                throw new ArrayExceptions("An incorrect type of variable was passed");
            }
        }
        if (arrayInput.size() != SIZE)
        {
            throw new ArrayExceptions("An incorrect amount of variables was passed");
        }
        for (int i = 0; i < arrayInput.size(); i++)
        {
            Integer elem = arrayInput.get(i);
            if (elem % 3 == 0) dividedByThree.add(elem);
            if (elem % 2 == 0) dividedByTwo.add(elem);
            if (elem % 2 != 0 && elem % 3 != 0) rest.add(elem);
        }
        System.out.print("Elements divided by two: ");
        printList(dividedByTwo);
        System.out.print("Elements divided by three: ");
        printList(dividedByThree);
        System.out.print("Elements divided neither by two or three: ");
        printList(rest);
    }
    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
