import java.util.ArrayList;

public class Set<T> extends ArrayList{
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2)
    {
        Set<T> resultSet = new Set<T>();
//        Set maxLenSet = (set1.size() >= set2.size()) ? set1 : set2;
//        Set minLenSet = (set1.size() > set2.size()) ? set2 : set1;
        for (int i = 0; i < set1.size(); i++) {
            Object elem = set1.get(i);
            if (!set2.contains(elem)) resultSet.add(elem);
        }
        for (int i = 0; i < set2.size(); i++) {
            Object elem = set2.get(i);
            if (!set1.contains(elem)) resultSet.add(elem);
        }
//        for (int i = 0; i < resultSet.size(); i++)
//        {
//            resultSet.set(i, resultSet.get(i).toString());
//        }
        return resultSet;
    }
}
