import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class User {
    private int age;
    private String name;
    private String surname;
    public User(int age, String name, String surname){
        setAge(age);
        setName(name);
        setSurname(surname);
    }
    public static ArrayList<User> CreateUsers(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User(17, "Никаноров", "Вячеслав"));
        users.add(new User(18, "Суворкин", "Егор"));
        users.add(new User(18, "Зайцев", "Егор"));
        users.add(new User(56, "Мешкова", "Ирина"));
        users.add(new User(9, "Семячкина", "Арина"));
        users.add(new User(9, "Сидоров", "Иван"));
        users.add(new User(10, "Курочкин", "Андрей"));
        users.add(new User(14, "Суворкина", "Виктория"));
        users.add(new User(20, "Денисов", "Денис"));
        users.add(new User(25, "Луценко", "Юлия"));
        return users;
    }
    public static Map<Integer, ArrayList<User>> processUsers(){
        Map<Integer, ArrayList<User>> users = new HashMap<>();
        ArrayList<User> createdUsers = CreateUsers();
        for (User user: createdUsers){
            if (!users.containsKey(user.getAge())) {
                users.put(user.getAge(), new ArrayList<User>());
            }
            users.get(user.getAge()).add(user);
        }
        return users;
    }
    public static void printUserMap(Map<Integer, ArrayList<User>> users, Integer age){
        Iterator<Map.Entry<Integer, ArrayList<User>>> iter = users.entrySet().iterator();
        while (iter.hasNext())
        {
            Map.Entry<Integer, ArrayList<User>> peopleSameAge = iter.next();
            if (peopleSameAge.getKey().equals(age)){
                System.out.println(String.format("Люди возраста %d лет:", age));
                for (User curUser: peopleSameAge.getValue()){
                    System.out.println(curUser.getName() + " " + curUser.getSurname());
                }
            }
        }
        if (!(users.containsKey(age))) System.out.println("Людей такого возраста нет");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
