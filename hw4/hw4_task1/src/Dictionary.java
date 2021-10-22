import java.util.*;

public class Dictionary{
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Сидоров", "Иван");
        dictionary.put("Суворкин", "Егор");
        dictionary.put("Никаноров", "Вячеслав");
        dictionary.put("Зенькович", "Алексей");
        dictionary.put("Зайцев", "Иван");
        dictionary.put("Перов", "Иван");
        dictionary.put("Кузнецов", "Андрей");
        dictionary.put("Мартынова", "Софья");
        dictionary.put("Орлова", "Софья");
        dictionary.put("Лозина", "Софья");
        return dictionary;
    }
    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> uniqueNames = new ArrayList<>();
        ArrayList<String> duplicateNames = new ArrayList<>();
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext())
        {
            Map.Entry<String, String> person = iter.next();
            String current_name = person.getValue();
            if ((!uniqueNames.contains(current_name)) && !(duplicateNames.contains(current_name)))
            {
                uniqueNames.add(current_name);
            }
            else
            {
                if (uniqueNames.contains(current_name))
                {
                    uniqueNames.remove(current_name);
                    duplicateNames.add(current_name);
                }
            }
        }
//        System.out.println(Arrays.toString(new ArrayList[]{uniqueNames}));
//        System.out.println(Arrays.toString(new ArrayList[]{duplicateNames}));
        for (int i = 0; i < duplicateNames.size(); i++)
        {
            removeItemFromMapByValue(map, duplicateNames.get(i));
        }
    }
    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        //напишите тут ваш код
        Map<String, String> mapDuplicate = new HashMap<String, String>(map);
        Iterator<Map.Entry<String, String>> iter = mapDuplicate.entrySet().iterator();
        while (iter.hasNext())
        {
            Map.Entry<String, String> person = iter.next();
            if (person.getValue().equals(value))
            {
                map.remove(person.getKey());
            }
        }
    }
    public static void printMap(Map<String,String> map){
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();

        while (iter.hasNext())
        {
            Map.Entry<String, String> person = iter.next();
            System.out.println(person.getKey() + " " + person.getValue());
        }
    }
    public static void main(String[] args) {
        //напишите тут ваш код
        Map <String, String> dict = createMap();
        printMap(dict);
        System.out.println();
        removeTheFirstNameDuplicates(dict);
        printMap(dict);
//        System.out.println();
//        removeItemFromMapByValue(dict, "Иван");
//        printMap(dict);

    }
}
